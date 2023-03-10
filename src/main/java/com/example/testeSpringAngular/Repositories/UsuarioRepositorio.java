package com.example.testeSpringAngular.Repositories;

import com.example.testeSpringAngular.models.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Long> {
}
