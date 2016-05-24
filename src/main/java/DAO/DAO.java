/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import java.util.Map;
import javax.ejb.Local;

/**
 *
 * @author Marcelo Augusto
 * @param <T>
 */
@Local
public interface DAO<T> {
    
    public boolean salvar(T obj);
    
    public boolean atualizar(T obj);
    
    public boolean excluir(T obj);
    
    public T buscar(Object chave, Class<T> entidade);
    
    public List<T> consultaLista(String consulta,Map<String,Object> parametros);
    
    public T consultaSimples(String consulta,Map<String,Object> parametros);
    
}
