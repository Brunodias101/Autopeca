package com.autopeca.autopeca.service;

import com.autopeca.autopeca.entity.Estoque;
import com.autopeca.autopeca.repository.AutoPecaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstoqueService {

    private final AutoPecaRepository autoPecaRepository;

    public EstoqueService(AutoPecaRepository autoPecaRepository) {
        this.autoPecaRepository = autoPecaRepository;
    }

    public Estoque cadastrarProduto(Estoque novoProduto) {
        Estoque produtoCadastrado = autoPecaRepository.save(novoProduto);
        return produtoCadastrado;
    }

    public List<Estoque> listar() {
        return autoPecaRepository.findAll();
    }

    public Optional<Estoque> listarPorId(Long id) {
        return autoPecaRepository.findById(id);
    }
}
