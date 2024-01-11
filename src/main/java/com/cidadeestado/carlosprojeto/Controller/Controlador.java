/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cidadeestado.carlosprojeto.Controller;

import com.cidadeestado.carlosprojeto.Entidades.Cidade;
import com.cidadeestado.carlosprojeto.Repository.RepositorioJpa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Renata
 */

@RestController
@RequestMapping(value = "/cidades")
public class Controlador {
    
    @Autowired
    private RepositorioJpa repositorio;
    
    @GetMapping
    public List<Cidade> findAll(){
        List<Cidade> result = repositorio.findAll();
        return result;
     
    }
    
    @GetMapping(value = "/{id}")
    public Cidade findById(@PathVariable Long id){
        Cidade result = repositorio.findById(id).get();
        return result;

}
    
    @PostMapping
    public Cidade insert(@RequestBody Cidade cid){
        Cidade result = repositorio.save(cid);
        return result;
    }
     
    
    
    
}
