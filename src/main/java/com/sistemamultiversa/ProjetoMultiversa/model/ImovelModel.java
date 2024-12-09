package com.sistemamultiversa.ProjetoMultiversa.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;


@Entity
@Table(name = "Imovel")
@Data
public class ImovelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String endereco;

    @Column(nullable = false)
    private Double valorAluguel;

    @ManyToOne
    @JoinColumn(name = "proprietario_id", nullable = false)
    private ProprietarioModel proprietario;

    @OneToMany(mappedBy = "imovel", cascade = CascadeType.ALL)
    private Set<InquilinoModel> inquilinos;
}

/*
_________________________________________________
@Entity
@Table(name="Aluno")
@Data
public class AlunoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Matricula;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @ManyToMany
    @JoinTable(
            name="Alunos_na_Disciplina",
            joinColumns = @JoinColumn(name="aluno_id"),
            inverseJoinColumns = @JoinColumn(name="disciplina_id")
    )
    private Set<DisciplinaModel> disciplinasAlunos;
*/
