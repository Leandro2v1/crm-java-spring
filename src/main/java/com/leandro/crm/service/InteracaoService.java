package com.leandro.crm.service;

import com.leandro.crm.model.Interacao;
import com.leandro.crm.repository.InteracaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteracaoService {

    @Autowired
    InteracaoRepository interacaoRepository;

    public List<Interacao> listarTodos() {
        return interacaoRepository.findAll();
    }

    public Interacao salvar(Interacao interacao) {
        return interacaoRepository.save(interacao);
    }




}

