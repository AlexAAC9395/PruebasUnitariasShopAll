package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Controller;

import com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity.Product;
import com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity.Usuario;
import com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/usuario")
//@Tag(name= "Usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {

    private final UsuarioService usuarioService;
    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> getUsuario(){
        return this.usuarioService.getUsuario();
    }

    @PostMapping
    public ResponseEntity<Object> registrarUsuario(@RequestBody Usuario usuario){
        return this.usuarioService.newusuario(usuario);
    }

    @PutMapping
    public ResponseEntity<Object> actualizarUsuario(@RequestBody Usuario usuario){
        return this.usuarioService.newusuario(usuario);
    }

    @DeleteMapping(path = "{usuarioId}")
    public ResponseEntity<Object> deleteUsuario(@PathVariable("usuarioId") Long Id){
        return this.usuarioService.deleteusuario(Id);
    }


    //@Operation(summary = "Create a new usuario")
    //@PostMapping
            //("/create")
    //public Usuario createUsuario(@RequestBody Usuario usuario){
        //return this.usuarioService.createUsuario(usuario);
    //public Usuario createUsuario(@RequestBody Usuario usuario){
        //return this.usuarioService.createUsuario(usuario);
    //}

    //@Operation(summary = "Get a user by ID")
    //@GetMapping//("/{Id}")
    //public Usuario getUsuario(@PathVariable Long Id){
      //  return usuarioService.getUsuario(Id);
    //}



    //@Operation(summary = "Find a user by name")
    //@GetMapping//("/findByName")
    //public Optional<Usuario> findByName(@RequestParam String name) {
        //return UsuarioService.findByName(name);
    //}

    //@Operation(summary = "Update a user by ID")
    //@PutMapping//("/{id}")
    //public Usuario updateUsuario(@PathVariable Long Id, @RequestBody Usuario usuario) {
        //return usuarioService.updateUsuario(Id, usuario);
    //}

    //@Operation(summary = "Delete a user by ID")
    //@DeleteMapping("/{Id}")
    //public void deleteUsuario(@PathVariable Long Id) {
        //usuarioService.deleteUsuario(Id);
    //}

    //@Operation(summary = "Get all users")
    //@GetMapping("/getAll")
    //public List<Usuario> getAllUsuario() {
        //return usuarioService.getAllUsuario();
    //}
    @Operation(summary = "Get the product list of a user")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Lista de productos del usuario",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Product.class),
                            examples = @ExampleObject(value = "[{\"IdProduct\": 1, \"IdCategory\": 1, \"IdUsuario\": 1, \"NameProduct\": \"Producto 1\", \"SalePrice\": 10.0, \"SpecificDetails\": \"Details 1\", \"Code\": 10, \"quantity\": 5}]")
                    )
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Usuario no encontrado",
                    content = @Content(
                            mediaType = "text/plain",
                            examples = @ExampleObject(value = "Usuario no encontrado")
                    )
            )
    })
    @GetMapping("/{id}/shoplist")
    public ResponseEntity<?> getShopList(@PathVariable Long id){
        Usuario usuario = (Usuario) usuarioService.getUsuario(id);
        if(usuario != null){
            List<Product> products = usuario.getShopList();
            return ResponseEntity.ok(products);}
        else{
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }
    }
}
