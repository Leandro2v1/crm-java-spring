package com.leandro.crm.controller;

import com.leandro.crm.model.Cliente;
import com.leandro.crm.model.Interacao;
import com.leandro.crm.service.InteracaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interacoes")
public class InteracaoController {

    @Autowired
    InteracaoService interacaoService;

    @GetMapping
    public List<Interacao> listarTodos() {
        return interacaoService.listarTodos();
    }

    @PostMapping
    public Interacao salvar(@RequestBody Interacao interacao) {
        return interacaoService.salvar(interacao);
    }

    @PutMapping("/{id}")
    public Interacao atualizar(@PathVariable Long id, @Valid @RequestBody Interacao interacao) {
        return interacaoService.atualizar(id, interacao);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        interacaoService.excluir(id);
    }
}
