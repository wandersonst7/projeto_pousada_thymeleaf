package com.example.gerenciadorhospedagem.Controllers;

import com.example.gerenciadorhospedagem.Repositories.AdministradorRepository;
import com.example.gerenciadorhospedagem.Repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AuthController {

    @Autowired
    AdministradorRepository administradorRepository;

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @GetMapping
    public String home(Model model){
        model.addAttribute("pageTitle", "Bem-vindo");
        return "fragments/main";
    }

}
