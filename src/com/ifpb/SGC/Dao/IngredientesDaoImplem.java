/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.Dao;

import com.ifpb.SGC.modelo.Ingrediente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ramil
 */
public class IngredientesDaoImplem implements IngredienteDao{
    Set<Ingrediente> listaDeIngredientes;
    
    public IngredientesDaoImplem(){
        listaDeIngredientes = new HashSet<>();
    }

    @Override
    public boolean salvar(Ingrediente ingrediente) {
        if (listaDeIngredientes.add(ingrediente)) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean Deletar(int codigo) {
        for(Ingrediente i: listaDeIngredientes){
           if (i.getCodigo() == codigo) {
               return listaDeIngredientes.remove(i);
           }
       }
       return false;
    }

    @Override
    public boolean editar(Ingrediente ingrediente) {
        for(Ingrediente i: listaDeIngredientes){
           if (i.getCodigo() == ingrediente.getCodigo()) {
               listaDeIngredientes.remove(i);
               listaDeIngredientes.add(ingrediente);
               return true;
           }
       }
       return false;
    }

    @Override
    public Set<Ingrediente> listarIngredientes() {
        return listaDeIngredientes;
    }

    @Override
    public Ingrediente buscarPorCodigo(int codigo) {
        for(Ingrediente i: listaDeIngredientes){
           if (i.getCodigo() == codigo) {
               return i;
           }
       }
       return null;
    }
    
    
}
