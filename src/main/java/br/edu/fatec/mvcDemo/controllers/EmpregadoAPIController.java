package br.edu.fatec.mvcDemo.controllers;

import br.edu.fatec.mvcDemo.models.Empregado;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/empregados")
public class EmpregadoAPIController {
    private static final List<Empregado> empregados = new ArrayList<Empregado>();

    public EmpregadoAPIController(){
        empregados.add(new Empregado("Teste", 1800));
        empregados.add(new Empregado("Teste2", 1900));
        empregados.add(new Empregado("Teste3", 2200));
        empregados.add(new Empregado("Teste4", 2500));
    }

    @GetMapping
    public List getEmpregados(Model model){
        model.addAttribute("empregados", empregados);
        return empregados;
    }
}
