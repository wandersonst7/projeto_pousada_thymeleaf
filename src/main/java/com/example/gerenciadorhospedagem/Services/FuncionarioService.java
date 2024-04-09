package com.example.gerenciadorhospedagem.Services;

import com.example.gerenciadorhospedagem.Models.Funcionario;

import java.util.List;

public interface FuncionarioService {
    public List<Funcionario> getAllFuncionarios();
    public Funcionario getFuncionarioById(Long id);
    public Funcionario saveFuncionario(Funcionario funcionario);
    public Funcionario updateFuncionario(Funcionario funcionario);
    public void deleteFuncionarioById(Long id);
}
