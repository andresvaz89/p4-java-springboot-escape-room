package org.factoriaf5.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class MovieController {
    @GetMapping("/hello")

    public String Hello(){
        return "Holissss a todos";
    }
    @GetMapping("/movies")
    public List<String> getMovies() {
        return List.of("Película 1", "Película 2", "Película 3");
    }
    @PostMapping("/movies")
    public void createMovie() {
        System.out.println("El método createMovie ha sido llamado");
    }
}

