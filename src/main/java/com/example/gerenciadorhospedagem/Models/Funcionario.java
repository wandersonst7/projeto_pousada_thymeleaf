package com.example.gerenciadorhospedagem.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "FUNCIONARIOS")
@Getter
@Setter
public class Funcionario {

    @Id
    @GeneratedValue
    private long id_func;

    @Column
    private String nome_usuario;

    @Column
    private String senha;

    @Column
    private float salario;

    @Column
    private String cpf;

    @Column
    private LocalDate data_contratacao;


}
