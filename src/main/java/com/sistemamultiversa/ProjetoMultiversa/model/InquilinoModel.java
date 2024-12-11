package com.sistemamultiversa.ProjetoMultiversa.model;


import jakarta.persistence.*;
        import lombok.Data;

@Entity
@Table(name = "Inquilino")
@Data
public class InquilinoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String nome;

    @Column(unique = true, length = 100)
    private String email;

    @ManyToOne
    @JoinColumn(name = "imovel_id")
    private ImovelModel imovel;
}