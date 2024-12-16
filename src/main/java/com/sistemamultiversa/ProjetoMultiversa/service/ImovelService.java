package com.sistemamultiversa.ProjetoMultiversa.service;

import com.sistemamultiversa.ProjetoMultiversa.model.ImovelModel;
import com.sistemamultiversa.ProjetoMultiversa.repositorio.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImovelService {


    @Autowired
    private ImovelRepository imovelRepository;


    public ImovelService(ImovelRepository imovelRepository) {
        this.imovelRepository = imovelRepository;
    }


    public List<ImovelModel> listarTodos() {
        return imovelRepository.findAll();
    }


    public Optional<ImovelModel> buscarPorId(Long id) {
        return imovelRepository.findById(id);
    }


    public ImovelModel salvar(ImovelModel imovel) {
        return imovelRepository.save(imovel);
    }


    public static ImovelModel update(Long id, ImovelModel imovel) {
    return imovel;
    }


    public void deletar(Long id) {
        imovelRepository.deleteById(id);
    }


}