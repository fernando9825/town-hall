package com.fernando9825.townhall.controllers;

import com.fernando9825.townhall.models.entity.Persona;
import com.fernando9825.townhall.models.services.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AlcaldiaController {

    @Autowired
    IPersonaService personaService;


    @GetMapping("/")
    public String redireccionar(){
        return "redirect:/inicio";
    }

    @GetMapping("/inicio")
    public String inicio(Model model){
        model.addAttribute("titulo", "Bienvenido/a");
        return "/inicio";
    }

    @GetMapping("/persona-formulario")
    public String registrarAlcaldia(Model model){
        model.addAttribute("titulo", "Registrar una persona");
        return "/persona-formulario";
    }

    @PostMapping("/persona-formulario")
    public String crearPersona(Persona persona, Model model){
        personaService.save(persona);
        return "/listar-personas";
    }

    @GetMapping("/listar-personas")
    public String listarPersonas(Model model){
        List<Persona> personas = personaService.findAll();
        model.addAttribute("personas", personas);
        return "/listar-personas";
    }

}
