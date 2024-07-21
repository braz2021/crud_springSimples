package com.crud.portifolio;
import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

@AllArgsConstructor
@NoArgsConstructor
@Table(name="atleta")

public class Atleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_atleta")
    private long id;
    @Column (name="tx_nome")
    private String nome;
    @Column (name="tx_idade")
    private int idade;
    @Column (name="tx_posicao")
    private String posicao;
}
