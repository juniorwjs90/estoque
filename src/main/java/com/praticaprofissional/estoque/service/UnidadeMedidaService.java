package com.praticaprofissional.estoque.service;

import com.praticaprofissional.estoque.model.UnidadeMedida;
import com.praticaprofissional.estoque.repository.UnidadeMedidaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UnidadeMedidaService {
    private final UnidadeMedidaRepository repository;
    public UnidadeMedida adicionarUnidadeMedida(UnidadeMedida unidadeMedidaParaSalvar){
        return repository.save(unidadeMedidaParaSalvar);
    }
    public List<UnidadeMedida> listarUnidadeMedida(){
        return repository.findAll();
    }

    public Optional<UnidadeMedida> buscarUnidadeMedidaPorId(Long unidadeMedidaId){
        return repository.findById(unidadeMedidaId);
    }

    public UnidadeMedida editarUnidadeMedida(Long unidadeMedidaId, UnidadeMedida unidadeMedidaEditar){
        Optional<UnidadeMedida> unidadeMedidadParaEditar = buscarUnidadeMedidaPorId(unidadeMedidaId);
        if (unidadeMedidadParaEditar.isPresent()){
            unidadeMedidaEditar.setId(unidadeMedidaId);
            return repository.save(unidadeMedidaEditar);
        }
        return null;
    }

    public String apagarUnidadeMedida(Long unidadeMedidaId){
        Optional<UnidadeMedida> unidadeMedidaParaApagar = buscarUnidadeMedidaPorId(unidadeMedidaId);
        if (unidadeMedidaParaApagar.isPresent()){
            repository.deleteById(unidadeMedidaId);
            return "Unidade de Medida apagada.";
        }else {
            return "Não foi possível apagar a unidade de medida.";
        }
    }
}
