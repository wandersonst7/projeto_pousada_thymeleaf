package com.example.gerenciadorhospedagem.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "FUNCIONARIOS")
@Getter
@Setter
public class Funcionario {

    @Id
    @GeneratedValue
    private Long id_func;

    @Column
    private String nome_completo;

    @Column(unique = true)
    private String nome_usuario;

    @Column
    private String senha;

    @Column
    private Float salario;

    @Column
    private String cpf;

    @Column
    private Date data_contratacao;


}
