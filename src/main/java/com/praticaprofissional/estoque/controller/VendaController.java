package com.praticaprofissional.estoque.controller;

import com.praticaprofissional.estoque.model.Venda;
import com.praticaprofissional.estoque.service.VendaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/venda")
public class VendaController {

    private final VendaService service;

    @CrossOrigin(origins = "*")
    public Venda salvar(@RequestBody Venda addVenda){
        return service.adicionarVenda(addVenda);
    }

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<Venda> consultarVenda(){
        return service.listarVenda();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public Optional<Venda> buscarVendaPorId(@PathVariable(name = "id") Long vendaId){
        return service.buscarVendaPorId(vendaId);
    }

    @CrossOrigin(origins = "*")
    @PutMapping("/{id}")
    public Venda editarVenda(@PathVariable(name = "id") Long vendaId, @RequestBody Venda vendaParaEditar){
        return service.editarVenda(vendaId, vendaParaEditar);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public String apagarVendaPorId(@PathVariable(name = "id") Long vendaId){
        return service.apagarVenda(vendaId);
    }
}
