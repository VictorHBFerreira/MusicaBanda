package br.com.fiap.restful.controller;

import br.com.fiap.restful.entity.Musica;
import br.com.fiap.restful.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("musica")
public class MusicaController {

    @Autowired
    private MusicaRepository rep;

    @GetMapping("form")
    private String abrirForm(){
        return "musica/form";
    }

    @PostMapping("cadastrar")
    private String cadastrar(Musica musica, Model model){
        rep.save(musica);
        model.addAttribute(musica);
        return"musica/çuçeço";
    }



    }



