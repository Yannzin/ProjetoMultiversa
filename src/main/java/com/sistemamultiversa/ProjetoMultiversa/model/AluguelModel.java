package com.sistemamultiversa.ProjetoMultiversa.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public InquilinoModel getInquilino() {
        return inquilino;
    }

    public void setInquilino(InquilinoModel inquilino) {
        this.inquilino = inquilino;
    }

    public ImovelModel getImovel() {
        return imovel;
    }

    public void setImovel(ImovelModel imovel) {
        this.imovel = imovel;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(Double valorMensal) {
        this.valorMensal = valorMensal;
    }


}
