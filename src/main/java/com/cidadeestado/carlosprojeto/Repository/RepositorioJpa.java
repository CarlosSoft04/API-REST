/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cidadeestado.carlosprojeto.Repository;

import com.cidadeestado.carlosprojeto.Entidades.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Renata
 */
public interface RepositorioJpa extends JpaRepository<Cidade, Long> {
    
}
