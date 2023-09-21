package com.praticaprofissional.estoque.service;

import com.praticaprofissional.estoque.model.UnidadeMedida;
import com.praticaprofissional.estoque.repository.UnidadeMedidaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UnidadeMedidaService {
    private final UnidadeMedidaRepository repository;
    public UnidadeMedida salvarUnidadeMedida(UnidadeMedida unidadeMedidaParaSalvar){
        return repository.save(unidadeMedidaParaSalvar);
    }

    public List<UnidadeMedida> listarUnidadeMedida(){
        return repository.findAll();
    }
}
