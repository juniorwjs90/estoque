package com.praticaprofissional.estoque.controller;

import com.praticaprofissional.estoque.model.Cliente;
import com.praticaprofissional.estoque.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService service;

    @CrossOrigin(origins = "*")
    @PostMapping
    public Cliente salvar(@RequestBody Cliente addCliente){
       return service.adicionarCliente(addCliente);
    }

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<Cliente> consultarCliente(){
        return service.listarCliente();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public Optional<Cliente> buscarClientePorId(@PathVariable(name = "id") Long clienteId){
        return service.buscarClientePorId(clienteId);
    }

    @CrossOrigin(origins = "*")
    @PutMapping("/{id}")
    public Cliente editarCliente(@PathVariable(name = "id") Long clienteId, @RequestBody Cliente clienteParaEditar){
        return service.editarCliente(clienteId, clienteParaEditar);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public String apagarClientePorId(@PathVariable(name = "id") Long clienteId){
        return service.apagarCliente(clienteId);
    }
}
