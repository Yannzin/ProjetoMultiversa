package com.sistemamultiversa.ProjetoMultiversa.repositorio;


import com.sistemamultiversa.ProjetoMultiversa.model.ImovelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ImovelRepository extends JpaRepository<ImovelModel, Long> {
}

