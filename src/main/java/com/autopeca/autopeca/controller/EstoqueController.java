package com.autopeca.autopeca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("autopeca")
public class EstoqueController {

    @GetMapping
    public String olaMundo() {
        return "Ola";
    }
}
