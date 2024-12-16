package com.sistemamultiversa.ProjetoMultiversa.service;

import com.sistemamultiversa.ProjetoMultiversa.model.ProprietarioModel;
import com.sistemamultiversa.ProjetoMultiversa.repositorio.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProprietarioService {


    @Autowired
    private ProprietarioRepository proprietarioRepository;


    public ProprietarioModel salvar(ProprietarioModel proprietario) {
        return proprietarioRepository.save(proprietario);
    }


    public List<ProprietarioModel> listarTodos() {
        return proprietarioRepository.findAll();
    }


    public Optional<ProprietarioModel> buscarPorId(Long id) {
        return proprietarioRepository.findById(id);
    }


    public static ProprietarioModel update(Long id, ProprietarioModel proprietario) {
        return proprietario;
    }


    public static void deleteById(Long id) {
    }


}