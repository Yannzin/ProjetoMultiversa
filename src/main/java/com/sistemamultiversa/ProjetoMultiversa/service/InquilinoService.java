package com.sistemamultiversa.ProjetoMultiversa.service;


import com.sistemamultiversa.ProjetoMultiversa.model.InquilinoModel;
import com.sistemamultiversa.ProjetoMultiversa.repositorio.InquilinoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InquilinoService {

    private final InquilinoRepository inquilinoRepository;

    public InquilinoService(InquilinoRepository inquilinoRepository) {
        this.inquilinoRepository = inquilinoRepository;
    }

    public List<InquilinoModel> listarTodos() {
        return inquilinoRepository.findAll();
    }

    public Optional<InquilinoModel> buscarPorId(Long id) {
        return inquilinoRepository.findById(id);
    }

    public InquilinoModel salvar(InquilinoModel inquilino) {
        return inquilinoRepository.save(inquilino);
    }

    public void deletar(Long id) {
        inquilinoRepository.deleteById(id);
    }
}
