package com.example.gerenciadorhospedagem.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "QUARTOS")
@Getter
@Setter
public class Quarto {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Integer numero;

    @Column
    private String descricao;

    @Column
    private Integer capacidade;

    @Column
    private String tipo;

    @Column
    private Boolean disponibilidade = true;

    @Column
    private Float preco;

    @Column
    private Boolean limpeza = true;


}
