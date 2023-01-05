package com.autopeca.autopeca.controller;

import com.autopeca.autopeca.entity.Estoque;
import com.autopeca.autopeca.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "autopeca")
public class EstoqueController {

    @Autowired
    private EstoqueService estoqueService;


    @GetMapping
    public List<Estoque> listar(){
        return estoqueService.listar();
    }
    @GetMapping("/{id}")
    public Optional<Estoque> listarPorId(@PathVariable Long id){
        return estoqueService.listarPorId(id);
    }

    @PostMapping()
    public Estoque cadastrarProduto(@RequestBody Estoque estoque) {
        Estoque produtoCadastradoComSucesso = estoqueService.cadastrarProduto(estoque);
        return produtoCadastradoComSucesso;
    }

}
