/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividadedocker.service;

import DAO.DAO;
import entidade.Pessoa;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author kaiqu
 */
@Stateless
public class ServicePessoaController implements ServicePessoa {

    @Inject
    private DAO<Pessoa> dao;

    @Override
    public boolean salvar(Pessoa pessoa) {
        return dao.salvar(pessoa);
    }
}
