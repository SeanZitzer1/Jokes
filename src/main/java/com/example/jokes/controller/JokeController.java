package com.example.jokes.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import com.example.jokes.service.JokeService;
import com.example.jokes.model.Joke;



@RestController
@RequestMapping("/api/jokes")
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/random")
    public ResponseEntity<Joke> getRandomJoke() {
        return ResponseEntity.ok(jokeService.getRandomJoke());
    }
}