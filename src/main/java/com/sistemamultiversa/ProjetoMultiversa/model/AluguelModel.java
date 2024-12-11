package com.sistemamultiversa.ProjetoMultiversa.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "Aluguel")
@Data
public class AluguelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "inquilino_id", nullable = false)
    private InquilinoModel inquilino;

    @ManyToOne
    @JoinColumn(name = "imovel_id", nullable = false)
    private ImovelModel imovel;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name =  "data_fim", nullable = false)
    private LocalDate dataFim;

    @Column(name = "valor_mensal", nullable = false)
    private Double valorMensal;

}
