package com.praticaprofissional.estoque.controller;

import com.praticaprofissional.estoque.model.Produto;
import com.praticaprofissional.estoque.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoService service;

    @CrossOrigin(origins = "*")
    public Produto salvar(@RequestBody Produto addProduto){
        return service.adicionarProduto(addProduto);
    }

    @GetMapping("/{id}")
    public Optional<Produto> buscarProdutoPorId(@PathVariable(name = "id") Long produtoId){
        return service.buscarProdutoPorId(produtoId);
    }
    @PutMapping("/{id}")
    public Produto editarProduto(@PathVariable(name = "id") Long produtoId, @RequestBody Produto produtoParaEditar){
        return service.editarProduto(produtoId, produtoParaEditar);
    }

    @DeleteMapping("/{id}")
    public String apagarProdutoPorId(@PathVariable(name = "id") Long produtoId){
        return service.apagarProduto(produtoId);
    }
}
