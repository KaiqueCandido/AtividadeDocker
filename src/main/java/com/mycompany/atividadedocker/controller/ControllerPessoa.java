/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividadedocker.controller;

import com.mycompany.atividadedocker.service.ServicePessoa;
import entidade.Pessoa;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author kaiqu
 */
@Named 
@RequestScoped
public class ControllerPessoa {
    
    private Pessoa pessoa;
    
    @EJB
    private ServicePessoa servicePessoa;
    
    public ControllerPessoa (){
        pessoa = new Pessoa();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }            
    
    public String salvarPessoa(){
        servicePessoa.salvar(pessoa);
        pessoa = new Pessoa();
        return null;
    }
}
