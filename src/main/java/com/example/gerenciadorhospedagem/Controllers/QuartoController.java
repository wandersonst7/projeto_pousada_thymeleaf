package com.example.gerenciadorhospedagem.Controllers;

import com.example.gerenciadorhospedagem.Models.Quarto;
import com.example.gerenciadorhospedagem.Services.QuartoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/quartos")
public class QuartoController {

    private final QuartoService quartoService;

    public QuartoController(QuartoService quartoService){
        this.quartoService = quartoService;
    }

    @GetMapping
    public String listQuartos(Model model){
        model.addAttribute("tituloPagina", "Gerenciar Quartos");
        model.addAttribute("quartos", quartoService.getAllQuartos());

        // Aqui retornamos o nome da view
        return "quartos/main_quarto";
    }

    @GetMapping("/cadastrar")
    public String createQuartoForm(Model model){

        // criando quarto
        Quarto quarto = new Quarto();
        model.addAttribute("tituloPagina", "Cadastrar Quarto");
        model.addAttribute("quarto", quarto);

        return "quartos/create_quarto";
    }

    @PostMapping
    public String createQuarto(@ModelAttribute("quarto") Quarto quarto){
        quartoService.saveQuarto(quarto);
        return "redirect:/quartos";
    }

    @GetMapping("/editar/{id}")
    public String editQuartoForm(@PathVariable Long id, Model model){
        model.addAttribute("quarto", quartoService.getQuartoById(id));
        model.addAttribute("tituloPagina", "Editar Quarto");

        return "quartos/edit_quarto";
    }

    @PostMapping("/atualizar/{id}")
    public String updateQuarto(@PathVariable Long id, @ModelAttribute Quarto quarto){

        Quarto existingQuarto = quartoService.getQuartoById(id);
        existingQuarto.setId(quarto.getId());
        existingQuarto.setNumero(quarto.getNumero());
        existingQuarto.setDescricao(quarto.getDescricao());
        existingQuarto.setCapacidade(quarto.getCapacidade());
        existingQuarto.setTipo(quarto.getTipo());
        existingQuarto.setPreco(quarto.getPreco());

        quartoService.updateQuarto(existingQuarto);
        return "redirect:/quartos";
    }

    @PostMapping("/excluir")
    public String deleteQuarto(@RequestParam Long id){
        quartoService.deleteQuartoById(id);
        return "redirect:/quartos";
    }

}
