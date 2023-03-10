package com.example.testeSpringAngular.Controllers;

import com.example.testeSpringAngular.Repositories.UsuarioRepositorio;
import com.example.testeSpringAngular.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @GetMapping("/usuarios")
    public List<Usuario> getUsers() {
        return (List<Usuario>) usuarioRepositorio.findAll();
    }

    @PostMapping("/usuarios")
    void addUser(@RequestBody Usuario usuario) {
        usuarioRepositorio.save(usuario);
    }
}
