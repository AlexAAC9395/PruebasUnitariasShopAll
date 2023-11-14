package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.controller;

import com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity.Usuario;
import com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.mockito.BDDMockito.given;

@WebMvcTest(UserControllerTest.class)
public class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UsuarioService usuarioService;

    public void getSucess() throws Exception{
        Long usuarioId = 1L;
        Usuario usuario = new Usuario();
        usuario.setId(usuarioId);
        given(usuarioService.getUsuario(usuarioId)).willReturn(usuario);

        mockMvc.perform(MockMvcRequestBuilders.get("/users/{id}",usuarioId))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
