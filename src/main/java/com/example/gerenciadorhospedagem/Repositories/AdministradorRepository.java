package com.example.gerenciadorhospedagem.Repositories;


import com.example.gerenciadorhospedagem.Models.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Long> {
}
