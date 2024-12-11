package com.sistemamultiversa.ProjetoMultiversa.repositorio;


import com.sistemamultiversa.ProjetoMultiversa.model.ProprietarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProprietarioRepository extends JpaRepository<ProprietarioModel, Long> {
}