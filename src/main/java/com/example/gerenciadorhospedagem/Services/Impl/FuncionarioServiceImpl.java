package com.example.gerenciadorhospedagem.Services.Impl;

import com.example.gerenciadorhospedagem.Models.Funcionario;
import com.example.gerenciadorhospedagem.Repositories.FuncionarioRepository;
import com.example.gerenciadorhospedagem.Services.FuncionarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioServiceImpl(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @Override
    public List<Funcionario> getAllFuncionarios() {
        return funcionarioRepository.findAll();
    }

    @Override
    public Funcionario getFuncionarioById(Long id) {
        if(funcionarioRepository.findById(id).isPresent()){
            return funcionarioRepository.findById(id).get();
        }

        return null;
    }

    @Override
    public Funcionario saveFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    @Override
    public Funcionario updateFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    @Override
    public void deleteFuncionarioById(Long id) {
        funcionarioRepository.deleteById(id);
    }
}
