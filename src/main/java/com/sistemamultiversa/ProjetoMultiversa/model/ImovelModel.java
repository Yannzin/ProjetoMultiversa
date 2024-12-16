package com.sistemamultiversa.ProjetoMultiversa.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Imovel")
@Data
public class ImovelModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column(length = 100)
    private String endereco;


    @Column
    private Double valorAluguel;

    @ManyToOne
    @JoinColumn(name = "proprietario_id")
    private ProprietarioModel proprietario;

    @OneToMany(mappedBy = "imovel", cascade = CascadeType.ALL)
    private Set<InquilinoModel> inquilinos;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(Double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public ProprietarioModel getProprietario() {
        return proprietario;
    }

    public void setProprietario(ProprietarioModel proprietario) {
        this.proprietario = proprietario;
    }

    public Set<InquilinoModel> getInquilinos() {
        return inquilinos;
    }

    public void setInquilinos(Set<InquilinoModel> inquilinos) {
        this.inquilinos = inquilinos;
    }


}

