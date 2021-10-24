package no.kristiania.frilekeksamen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrilekController {

    @GetMapping(path = "/")
    public String hello() {
        return "Hello Kaikka world :) <3";
    }
}
