package com.praticaprofissional.estoque.service;

import com.praticaprofissional.estoque.model.Cliente;
import com.praticaprofissional.estoque.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    public Cliente adicionarCliente(Cliente clienteParaSalvar){
        return repository.save(clienteParaSalvar);
    }

    public List<Cliente> listarCliente(){
        return repository.findAll();
    }

    public Optional<Cliente> buscarClientePorId(Long clienteId){
        return repository.findById(clienteId);
    }

    public Cliente editarCliente(Long clienteId, Cliente clienteEditar){
        Optional<Cliente> clienteParaEditar = buscarClientePorId(clienteId);
        if (clienteParaEditar.isPresent()){
            clienteEditar.setId(clienteId);
            return repository.save(clienteEditar);
        }
        return null;
    }

    public String apagarCliente(Long clienteId){
        Optional<Cliente> clienteParaApagar = buscarClientePorId(clienteId);
        if (clienteParaApagar.isPresent()){
            repository.deleteById(clienteId);
            return "Cliente apagado com sucesso.";
        }else {
            return " Não foi possivel apagar";
        }
    }
}
