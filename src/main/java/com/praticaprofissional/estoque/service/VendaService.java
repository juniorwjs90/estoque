package com.praticaprofissional.estoque.service;

import com.praticaprofissional.estoque.model.Venda;
import com.praticaprofissional.estoque.repository.VendaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VendaService {

    private final VendaRepository repository;

    public Venda adicionarVenda(Venda vendaParaSalvar){
        return repository.save(vendaParaSalvar);
    }
    public List<Venda> listarVenda(){
        return repository.findAll();
    }

    public Optional<Venda> buscarVendaPorId(Long vendaId){
        return repository.findById(vendaId);
    }

    public Venda editarVenda(Long vendaId, Venda vendaEditar){
        Optional<Venda> vendaParaEditar = buscarVendaPorId(vendaId);
        if (vendaParaEditar.isPresent()){
            vendaEditar.setId(vendaId);
            return repository.save(vendaEditar);
        }
        return null;
    }

    public String apagarVenda(Long vendaId){
        Optional<Venda> vendaParaApagar = buscarVendaPorId(vendaId);
        if (vendaParaApagar.isPresent()) {
            repository.deleteById(vendaId);
            return "Venda apagada";
        }else {
            return "Não fi possível apagar";
        }
    }
}