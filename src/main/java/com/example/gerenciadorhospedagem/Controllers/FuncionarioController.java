package com.example.gerenciadorhospedagem.Controllers;

import com.example.gerenciadorhospedagem.Models.Funcionario;
import com.example.gerenciadorhospedagem.Services.FuncionarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    FuncionarioController(FuncionarioService funcionarioService){
        this.funcionarioService = funcionarioService;
    }

    @GetMapping
    public String listFuncionarios(Model model){
        model.addAttribute("tituloPagina", "Gerenciar Funcionários");
        model.addAttribute("funcionarios", funcionarioService.getAllFuncionarios());
        return "funcionarios/main_funcionario";
    }

    @GetMapping("/cadastrar")
    public String createFuncionarioForm(Model model){
        Funcionario funcionario = new Funcionario();
        model.addAttribute("tituloPagina", "Cadastrar Funcionário");
        model.addAttribute("funcionario", funcionario);

        return "funcionarios/create_funcionario";
    }

    @GetMapping("/editar/{id}")
    public String editFuncionarioForm(@PathVariable Long id, Model model){
        model.addAttribute("tituloPagina", "Editar Funcionário");
        model.addAttribute("funcionario", funcionarioService.getFuncionarioById(id));
        return "funcionarios/edit_funcionario";
    }

    @PostMapping
    public String createFuncionario(@ModelAttribute("funcionario") Funcionario funcionario){
        funcionarioService.saveFuncionario(funcionario);
        return "redirect:/funcionarios";
    }

    @PostMapping("/atualizar/{id}")
    public String updateFuncionario(@PathVariable Long id, @ModelAttribute Funcionario funcionario){

        Funcionario existingFuncionario = funcionarioService.getFuncionarioById(id);
        existingFuncionario.setNome_completo(funcionario.getNome_completo());
        existingFuncionario.setNome_usuario(funcionario.getNome_usuario());
        existingFuncionario.setSalario(funcionario.getSalario());
        existingFuncionario.setCpf(funcionario.getCpf());
        existingFuncionario.setData_contratacao(funcionario.getData_contratacao());

        funcionarioService.updateFuncionario(existingFuncionario);
        return "redirect:/funcionarios";
    }

    @PostMapping("/excluir")
    public String deleteFuncionario(@RequestParam Long id){
        funcionarioService.deleteFuncionarioById(id);
        return "redirect:/funcionarios";
    }
}
