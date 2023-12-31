package com.praticaprofissional.estoque.controller;

import com.praticaprofissional.estoque.model.UnidadeMedida;
import com.praticaprofissional.estoque.service.UnidadeMedidaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/unidademedida")
public class UnidadeMedidaController {

    private final UnidadeMedidaService service;
    @CrossOrigin(origins = "*")
    @PostMapping
    public UnidadeMedida salvar(@RequestBody UnidadeMedida addUnidadeMedida){
        return service.adicionarUnidadeMedida(addUnidadeMedida);
    }
    @CrossOrigin(origins = "*")
    @GetMapping
    public List<UnidadeMedida> consultarUnidadeMedida(){
        return service.listarUnidadeMedida();
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public Optional<UnidadeMedida> buscarUnidadeMedidaPorId(@PathVariable(name = "id") Long unidadeMedidaId){
        return service.buscarUnidadeMedidaPorId(unidadeMedidaId);
    }
    @CrossOrigin(origins = "*")
    @PutMapping("/{id}")
    public UnidadeMedida editarUnidadeMedida(@PathVariable(name = "id") Long unidadeMedidaId, @RequestBody UnidadeMedida unidadeMedidaEditar){
        return service.editarUnidadeMedida(unidadeMedidaId, unidadeMedidaEditar);
    }
    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public String apagarUnidadeMedidaPorId(@PathVariable(name = "id") Long unidadeMedidaId){
        return service.apagarUnidadeMedida(unidadeMedidaId);
    }
}
