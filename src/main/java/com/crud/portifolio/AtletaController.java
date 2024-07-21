package com.crud.portifolio;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
@RestController
@AllArgsConstructor
public class AtletaController {

    AtletaRepository atletaRepository;

    @GetMapping("/atleta")
    public List<Atleta>getAllAtleta(){
        return atletaRepository.findAll();
    }

    @GetMapping("/atleta/{id}")
    public Atleta gAtletaByid(@PathVariable Long id){
        return atletaRepository.findById(id).get();
    }

    @PostMapping("/atleta")
    public Atleta save(@RequestBody Atleta atleta){
        return atletaRepository.save(atleta);
    }

    @DeleteMapping("/atleta/{id}")
    public void deleteAtleta (@PathVariable Long id){
        atletaRepository.deleteById(id);
    }



    
}
