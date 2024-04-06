package com.example.gerenciadorhospedagem.Services;

import com.example.gerenciadorhospedagem.Models.Quarto;
import com.example.gerenciadorhospedagem.Repositories.QuartoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuartoServiceImpl implements QuartoService{

    private final QuartoRepository quartoRepository;

    public QuartoServiceImpl(QuartoRepository quartoRepository){
        this.quartoRepository = quartoRepository;
    }
    @Override
    public List<Quarto> getAllQuartos() {
        return quartoRepository.findAll();
    }

    @Override
    public Quarto getQuartoById(Long id) {
        if(quartoRepository.findById(id).isPresent()){
            return quartoRepository.findById(id).get();
        }

        return null;
    }

    @Override
    public Quarto saveQuarto(Quarto quarto) {
        return quartoRepository.save(quarto);
    }

    @Override
    public Quarto updateQuarto(Quarto quarto) {
        return quartoRepository.save(quarto);
    }

    @Override
    public void deleteQuartoById(Long id) {
        quartoRepository.deleteById(id);
    }
}
