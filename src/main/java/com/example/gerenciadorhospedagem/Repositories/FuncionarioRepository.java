package com.example.gerenciadorhospedagem.Repositories;

import com.example.gerenciadorhospedagem.Models.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
