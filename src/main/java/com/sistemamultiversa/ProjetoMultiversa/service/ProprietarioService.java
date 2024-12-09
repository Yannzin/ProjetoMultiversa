package com.sistemamultiversa.ProjetoMultiversa.service;

import com.sistemamultiversa.ProjetoMultiversa.model.ProprietarioModel;
import com.sistemamultiversa.ProjetoMultiversa.repositorio.ProprietarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProprietarioService {

    private final ProprietarioRepository proprietarioRepository;

    public ProprietarioService(ProprietarioRepository proprietarioRepository) {
        this.proprietarioRepository = proprietarioRepository;
    }

    public List<ProprietarioModel> listarTodos() {
        return proprietarioRepository.findAll();
    }

    public Optional<ProprietarioModel> buscarPorId(Long id) {
        return proprietarioRepository.findById(id);
    }

    public ProprietarioModel salvar(ProprietarioModel proprietario) {
        return proprietarioRepository.save(proprietario);
    }

    public void deletar(Long id) {
        proprietarioRepository.deleteById(id);
    }
}
