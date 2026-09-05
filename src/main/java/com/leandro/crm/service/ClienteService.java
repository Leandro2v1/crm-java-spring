package com.leandro.crm.service;

import com.leandro.crm.model.Cliente;
import com.leandro.crm.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente atualizar(Long id, Cliente clienteAtualizado) {
        clienteAtualizado.setId(id);
        return clienteRepository.save(clienteAtualizado);
    }

    public void excluir(Long id) {
        clienteRepository.deleteById(id);
    }

}
