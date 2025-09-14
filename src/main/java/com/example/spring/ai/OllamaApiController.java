package com.example.spring.ai;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ollama")
@RequiredArgsConstructor
public class OllamaApiController {

    private  final SpringAI springAI;


    @GetMapping("/joke")
    public String joke() {
        return springAI.tellMeAJoke();
    }

}
