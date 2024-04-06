package com.example.gerenciadorhospedagem.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ADMINISTRADORES")
@Getter @Setter
public class Administrador {
    @Id
    @GeneratedValue
    private long id_admin;

    @Column
    private String nome_usuario;

    @Column
    private String senha;
}
