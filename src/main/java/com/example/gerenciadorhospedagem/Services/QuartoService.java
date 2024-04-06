package com.example.gerenciadorhospedagem.Services;

import com.example.gerenciadorhospedagem.Models.Quarto;
import java.util.List;

public interface QuartoService {
    public List<Quarto> getAllQuartos();
    public Quarto getQuartoById(Long id);
    public Quarto saveQuarto(Quarto quarto);
    public Quarto updateQuarto(Quarto quarto);
    public void deleteQuartoById(Long id);
}
