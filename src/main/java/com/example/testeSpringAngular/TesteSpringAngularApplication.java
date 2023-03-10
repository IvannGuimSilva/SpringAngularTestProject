package com.example.testeSpringAngular;

import com.example.testeSpringAngular.Repositories.UsuarioRepositorio;
import com.example.testeSpringAngular.models.Usuario;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.stream.Stream;

@SpringBootApplication
public class TesteSpringAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteSpringAngularApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UsuarioRepositorio usuarioRepositorio) {
		return args -> {
			Stream.of("pessoa01", "pessoa02", "pessoa03").forEach(nome -> {
				Usuario novoUsuario  = new Usuario(nome, nome.toLowerCase() + "@gmail.com");
				usuarioRepositorio.save(novoUsuario);
			});
			usuarioRepositorio.findAll().forEach(System.out::println);
		};
	}
}
