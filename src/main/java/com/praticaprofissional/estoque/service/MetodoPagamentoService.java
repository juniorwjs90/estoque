package com.praticaprofissional.estoque.service;

import com.praticaprofissional.estoque.model.MetodoPagamento;
import com.praticaprofissional.estoque.repository.MetodoPagamentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MetodoPagamentoService {

    private final MetodoPagamentoRepository repository;

    public MetodoPagamento adicionarMetodoPagamento(MetodoPagamento metodoPagamentoParaSalvar){
        return repository.save(metodoPagamentoParaSalvar);
    }

    public List<MetodoPagamento> listarMetodoPagamento(){
        return repository.findAll();
    }

    public Optional<MetodoPagamento> buscarMetodoPagamebntoPorId(Long metodoPagamentoId){
        return repository.findById(metodoPagamentoId);
    }

    public MetodoPagamento editarMetodoPagamento(Long metodoPagamentoId, MetodoPagamento metodoPagamentoEditar){
        Optional<MetodoPagamento> metodoPagamentoParaEditar = buscarMetodoPagamebntoPorId(metodoPagamentoId);
        if (metodoPagamentoParaEditar.isPresent()){
            metodoPagamentoEditar.setId(metodoPagamentoId);
            return repository.save(metodoPagamentoEditar);
        }
        return null;
    }

    public String apagarMetodoPagamento(Long metodoPagamentoId){
        Optional<MetodoPagamento> metodoPagamentoParaApagar = buscarMetodoPagamebntoPorId(metodoPagamentoId);
        if (metodoPagamentoParaApagar.isPresent()){
            repository.deleteById(metodoPagamentoId);
            return "Metodo de pagamento apagado.";
        }else {
            return "Não foi possível apagar";
        }
    }
}
