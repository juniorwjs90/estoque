package com.praticaprofissional.estoque.controller;

import com.praticaprofissional.estoque.model.UnidadeMedida;
import com.praticaprofissional.estoque.service.UnidadeMedidaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/unidademedida")
public class UnidadeMedidaController {

    private final UnidadeMedidaService service;

    @PostMapping
    public UnidadeMedida salvar(@RequestBody UnidadeMedida addUnidadeMedida){
        return service.salvarUnidadeMedida(addUnidadeMedida);
    }

    @GetMapping
    public List<UnidadeMedida> consultarUnidadeMedida(){
        return service.listarUnidadeMedida();
    }
}
