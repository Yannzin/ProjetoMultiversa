package com.sistemamultiversa.ProjetoMultiversa.service;

import com.sistemamultiversa.ProjetoMultiversa.model.AluguelModel;
import com.sistemamultiversa.ProjetoMultiversa.repositorio.AluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AluguelService {


    @Autowired
    private AluguelRepository aluguelRepository;


    public AluguelService(AluguelRepository aluguelRepository) {
        this.aluguelRepository = aluguelRepository;
    }


    public List<AluguelModel> listarTodos() {
        return aluguelRepository.findAll();
    }


    public Optional<AluguelModel> buscarPorId(Long id) {
        return aluguelRepository.findById(id);
    }


    public AluguelModel salvar(AluguelModel aluguel) {
        return aluguelRepository.save(aluguel);
    }


    public static AluguelModel update(Long id, AluguelModel aluguel) {
    return aluguel;
    }


    public void deletar(Long id) {
        aluguelRepository.deleteById(id);
    }
}

