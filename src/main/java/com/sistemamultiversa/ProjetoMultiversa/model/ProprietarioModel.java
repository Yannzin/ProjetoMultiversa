package com.sistemamultiversa.ProjetoMultiversa.model;


import jakarta.persistence.*;
        import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "Proprietario")
@Data
public class ProprietarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String nome;

    @Column(unique = true, length = 100)
    private String email;

    @OneToMany(mappedBy = "proprietario", cascade = CascadeType.ALL)
    private Set<ImovelModel> imoveis;
}