package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Service;

import com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity.Usuario;
import com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class TaskUsuarioService {

HashMap<String, Object> datos;
    private static UsuarioRepository usuarioRepository;

    @Autowired
    public TaskUsuarioService(UsuarioRepository usuarioRepository){
        TaskUsuarioService.usuarioRepository = usuarioRepository;
    }
    public List<Usuario> getAllUsuario(){
        return usuarioRepository.findAll();
    }
    //public Usuario newusuario(Usuario usuario){
        //return usuarioRepository.save(usuario);
    //}

    public ResponseEntity<Object> newusuario(Usuario usuario) {
        Optional<Usuario> res = usuarioRepository.findByName(usuario.getName());
        datos = new HashMap<>();

        if (res.isPresent() && usuario.getIdUsuario() == null) {
            datos.put("error", true);
            datos.put("message", "Ya existe un usuario con ese nombre");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
            );
        }
        datos.put("message", "Se guardo con exito");
        if (usuario.getIdUsuario() != null) {
            datos.put("message", "Se actualizo con exito");
        }
        usuarioRepository.save(usuario);
        datos.put("data", usuario);
        return new ResponseEntity<>(
                datos,
                HttpStatus.CREATED
        );
    }
        public ResponseEntity<Object> deleteusuario(Long id){
            datos = new HashMap<>();
            boolean existe= usuarioRepository.existsById(id);
            if (!existe){
                datos.put("error",true);
                datos.put("message","No existe un usuario con ese id");
                return new ResponseEntity<>(
                        datos,
                        HttpStatus.CONFLICT
                );
            }
            usuarioRepository.deleteById(id);
            datos.put("message","Usuario eliminado");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.ACCEPTED
            );
        }

    //public Usuario getUsuario(Long Id){
      //  return usuarioRepository.findById(Id).orElse(null);
    //}

    public static Optional<Usuario> findByName(String name) {
        return usuarioRepository.findByName(name);
    }
    //public void deleteUsuario(Long Id){
        //usuarioRepository.deleteById(Id);
    //}

    public Usuario updateUsuario(Long Id, Usuario updateUsuario) {
        Usuario existingUsuario = usuarioRepository.findById(Id).orElse(null);
        if (existingUsuario != null) {
            existingUsuario.setUsuario(updateUsuario.getUsuario());
            return usuarioRepository.save(existingUsuario);
        }
        return null;
    }

    public List<Usuario> getUsuario() {
        return usuarioRepository.findAll();
    }

    public ResponseEntity<Object> deleteUsuario(Long id) {
        return null;
    }

    public Object getUsuario(Long id) {
        return null;
    }

    public Object get(Long userId){
        return usuarioRepository.getReferenceById(userId);
    }
}
