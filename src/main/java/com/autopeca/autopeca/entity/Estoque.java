package com.autopeca.autopeca.entity;


import com.autopeca.autopeca.enums.ProdutoStatus;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@javax.persistence.Entity
@Table(name= "tbEstoque")
public class Estoque {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public String nome;

    public String descricao;

    public Double preco;

    public ProdutoStatus status;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public ProdutoStatus getStatus() {
        return status;
    }

    public void setStatus(ProdutoStatus status) {
        this.status = status;
    }
}
