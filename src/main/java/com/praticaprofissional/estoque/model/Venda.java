package com.praticaprofissional.estoque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int cpf;
    private String nome_cliente;
    private String email;
    private String cep;
    private int numero;
    private int numero_telefone_fixo;
    private int numero_telefone_celular;
    private String endereco;
    private String bairro;
    private String estado;
    private String municipio;
    private String complemento;
    //dados do produto
    private long codigo_produto;
    private String nome_produto;
    private float valor_produto;
    private String tipo_unidade;
    private long quantidade_produto;
    //dados do pagamento
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero_telefone_fixo() {
        return numero_telefone_fixo;
    }

    public void setNumero_telefone_fixo(int numero_telefone_fixo) {
        this.numero_telefone_fixo = numero_telefone_fixo;
    }

    public int getNumero_telefone_celular() {
        return numero_telefone_celular;
    }

    public void setNumero_telefone_celular(int numero_telefone_celular) {
        this.numero_telefone_celular = numero_telefone_celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public long getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(long codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public float getValor_produto() {
        return valor_produto;
    }

    public void setValor_produto(float valor_produto) {
        this.valor_produto = valor_produto;
    }

    public String getTipo_unidade() {
        return tipo_unidade;
    }

    public void setTipo_unidade(String tipo_unidade) {
        this.tipo_unidade = tipo_unidade;
    }

    public long getQuantidade_produto() {
        return quantidade_produto;
    }

    public void setQuantidade_produto(long quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
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
