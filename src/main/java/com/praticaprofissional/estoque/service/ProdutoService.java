package com.praticaprofissional.estoque.service;

import com.praticaprofissional.estoque.model.Produto;
import com.praticaprofissional.estoque.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProdutoService {

    private final ProdutoRepository repository;

    public Produto adicionarProduto(Produto produtoParaSalvar){
        return repository.save(produtoParaSalvar);
    }
    public List<Produto> listarProduto(){
        return repository.findAll();
    }
    public Optional<Produto> buscarProdutoPorId(Long produtoId){
        return repository.findById(produtoId);
    }

    public Produto editarProduto(Long produtoId, Produto produtoEditar){
        Optional<Produto> produtoParaEditar = buscarProdutoPorId(produtoId);
        if (produtoParaEditar.isPresent()){
            produtoEditar.setId(produtoId);
            return repository.save(produtoEditar);
        }
        return null;
    }

    public String apagarProduto(Long produtoId){
        Optional<Produto> produtoParaApagar = buscarProdutoPorId(produtoId);
        if (produtoParaApagar.isPresent()){
            repository.deleteById(produtoId);
            return "Produto apagado";
        }else {
            return "Não foi possível apagar o produto.";
        }
    }

}
