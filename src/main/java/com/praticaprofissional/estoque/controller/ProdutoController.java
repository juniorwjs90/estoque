package com.praticaprofissional.estoque.controller;

import com.praticaprofissional.estoque.model.Produto;
import com.praticaprofissional.estoque.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoService service;

    @CrossOrigin(origins = "*")
    @PostMapping
    public Produto salvar(@RequestBody Produto addProduto){
        return service.adicionarProduto(addProduto);
    }

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<Produto> consultarProduto(){
        return service.listarProduto();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public Optional<Produto> buscarProdutoPorId(@PathVariable(name = "id") Long produtoId){
        return service.buscarProdutoPorId(produtoId);
    }

    @CrossOrigin(origins = "*")
    @PutMapping("/{id}")
    public Produto editarProduto(@PathVariable(name = "id") Long produtoId, @RequestBody Produto produtoParaEditar){
        return service.editarProduto(produtoId, produtoParaEditar);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public String apagarProdutoPorId(@PathVariable(name = "id") Long produtoId){
        return service.apagarProduto(produtoId);
    }
}
