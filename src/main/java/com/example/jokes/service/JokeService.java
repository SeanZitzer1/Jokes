package com.example.jokes.service;

import com.example.jokes.model.Joke;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class JokeService {
    private final RestTemplate restTemplate;

    @Autowired
    public JokeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Joke getRandomJoke() {
        String url = "https://official-joke-api.appspot.com/random_joke";
        return restTemplate.getForObject(url, Joke.class);
    }
}
