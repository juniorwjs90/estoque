package com.praticaprofissional.estoque.controller;

import com.praticaprofissional.estoque.model.Estoque;
import com.praticaprofissional.estoque.service.EstoqueService;
import com.praticaprofissional.estoque.service.MetodoPagamentoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estoque")
@AllArgsConstructor
public class EstoqueController {

    private final EstoqueService service;

    @CrossOrigin(origins = "*")
    @PostMapping
    public Estoque salvar(@RequestBody Estoque addEstoque){
        return service.adicionarEstoque(addEstoque);
    }

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<Estoque> consultarEstoque(){
        return service.listarEstoque();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public Optional<Estoque> buscarEstoquePorId(@PathVariable(name = "id") Long estoqueId){
        return service.buscarEstoquePorId(estoqueId);
    }

    @CrossOrigin(origins = "*")
    @PutMapping
    public Estoque editarEstoque(@PathVariable(name = "id") Long estoqueId, Estoque estoqueParaEditar){
        return service.editarEstoque(estoqueId, estoqueParaEditar);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public String apagarEstoque (@PathVariable(name = "id") Long estoqueId){
        return service.apagarEstoque(estoqueId);
    }
}
