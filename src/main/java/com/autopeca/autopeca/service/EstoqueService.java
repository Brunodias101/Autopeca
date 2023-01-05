package com.autopeca.autopeca.service;

import com.autopeca.autopeca.entity.Estoque;
import com.autopeca.autopeca.repository.AutoPecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstoqueService {


    private AutoPecaRepository autoPecaRepository;

    public Estoque cadastrarProduto(Estoque novoProduto) {
        Estoque produtoCadastrado = autoPecaRepository.save(novoProduto);
        return produtoCadastrado;
    }
}
