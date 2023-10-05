package com.praticaprofissional.estoque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MetodoPagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long especie;
    private long cartao;
    private long pix;
    private long desconto;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEspecie() {
        return especie;
    }

    public void setEspecie(long especie) {
        this.especie = especie;
    }

    public long getCartao() {
        return cartao;
    }

    public void setCartao(long cartao) {
        this.cartao = cartao;
    }

    public long getPix() {
        return pix;
    }

    public void setPix(long pix) {
        this.pix = pix;
    }

    public long getDesconto() {
        return desconto;
    }

    public void setDesconto(long desconto) {
        this.desconto = desconto;
    }
}
