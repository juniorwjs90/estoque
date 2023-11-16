package com.praticaprofissional.estoque.controller;

import com.praticaprofissional.estoque.model.MetodoPagamento;
import com.praticaprofissional.estoque.service.MetodoPagamentoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/metodopagamento")
public class MetodoPagamentoController {

    private final MetodoPagamentoService service;

    @CrossOrigin(origins = "*")
    @PostMapping
    public MetodoPagamento salvar(@RequestBody MetodoPagamento addMetodoPagamento){
        return service.adicionarMetodoPagamento(addMetodoPagamento);
    }

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<MetodoPagamento> consultarMetodoPagamento(){
        return service.listarMetodoPagamento();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public Optional<MetodoPagamento> buscarMetodoPagamentoPorId(@PathVariable(name = "id") Long metodoPagamentoId){
        return service.buscarMetodoPagamebntoPorId(metodoPagamentoId);
    }
    @CrossOrigin(origins = "*")
    @PutMapping
    public MetodoPagamento editarMetodoPagamento(@PathVariable(name = "id") Long metodoPagamentoId, @RequestBody MetodoPagamento metodoPagamentoParaEditar){
        return service.editarMetodoPagamento(metodoPagamentoId, metodoPagamentoParaEditar);
    }

    @DeleteMapping("/{id}")
    public String apagarMetodoPagamento(@PathVariable(name = "id") Long metodoPagamentoId){
        return service.apagarMetodoPagamento(metodoPagamentoId);
    }
}
