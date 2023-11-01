package br.edu.fatec.mvcDemo.controllers;


import br.edu.fatec.mvcDemo.models.Empregado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/empregados")
public class EmpregadoController {
    private static final List<Empregado> empregados = new ArrayList<Empregado>();

    public EmpregadoController(){
        empregados.add(new Empregado("Teste", 1800));
        empregados.add(new Empregado("Teste2", 1900));
        empregados.add(new Empregado("Teste3", 2200));
        empregados.add(new Empregado("Teste4", 2500));
    }

    @GetMapping
    public String getEmpregados(Model model){
        model.addAttribute("empregados", empregados);
        return "empregados";
    }
}
