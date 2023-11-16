package com.praticaprofissional.estoque.service;

import com.praticaprofissional.estoque.model.Estoque;
import com.praticaprofissional.estoque.repository.EstoqueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EstoqueService {
    private final EstoqueRepository repository;

    public Estoque adicionarEstoque(Estoque estoqueParaSalvar){
        return repository.save(estoqueParaSalvar);
    }

    public List<Estoque> listarEstoque(){
        return repository.findAll();
    }

    public Optional<Estoque> buscarEstoquePorId(Long estoqueId){
        return repository.findById(estoqueId);
    }

    public Estoque editarEstoque(Long estoqueId, Estoque estoqueEditar){
        Optional<Estoque> estoqueParaEditar = buscarEstoquePorId(estoqueId);
        if (estoqueParaEditar.isPresent()){
            estoqueEditar.setId(estoqueId);
            return repository.save(estoqueEditar);
        }
        return null;
    }

    public String apagarEstoque(Long estoqueId){
        Optional<Estoque> estoqueParaApagar = buscarEstoquePorId(estoqueId);
        if (estoqueParaApagar.isPresent()){
            repository.deleteById(estoqueId);
            return "Estoque apagado com sucesso;";
        }else
            return "Não foi possível apagar o estoque";
    }
}
