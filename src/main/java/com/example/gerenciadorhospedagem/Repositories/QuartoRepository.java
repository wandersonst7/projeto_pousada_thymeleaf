package com.example.gerenciadorhospedagem.Repositories;

import com.example.gerenciadorhospedagem.Models.Quarto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuartoRepository extends JpaRepository<Quarto, Long> {
}
