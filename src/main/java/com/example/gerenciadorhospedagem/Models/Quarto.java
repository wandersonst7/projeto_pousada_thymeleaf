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
    private long id;

    @Column
    private int numero;

    @Column
    private String descricao;

    @Column
    private int capacidade;

    @Column
    private String tipo;

    @Column
    private boolean disponibilidade = true;

    @Column
    private float preco;

    @Column
    private boolean limpeza = true;


}
