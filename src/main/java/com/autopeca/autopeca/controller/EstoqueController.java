package com.autopeca.autopeca.controller;

import com.autopeca.autopeca.entity.Estoque;
import com.autopeca.autopeca.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "autopeca")
public class EstoqueController {


    private EstoqueService estoqueService;

    @GetMapping
    public String olaMundo() {
        return "Ola";
    }

    @PostMapping
    public Estoque cadastrarProduto(@RequestBody Estoque estoque) {
        Estoque produtoCadastradoComSucesso = estoqueService.cadastrarProduto(estoque);
        return produtoCadastradoComSucesso;
    }
}
