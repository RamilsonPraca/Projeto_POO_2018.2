/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.Dao;

import com.ifpb.SGC.modelo.Dependente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ramil
 */
public class DependenteDaoImplem implements DependenteDao{
    Set<Dependente> listaDeDependentes;
    
    public DependenteDaoImplem(){
        listaDeDependentes = new HashSet<>();
    }

    @Override
    public boolean salvar(Dependente dependente) {
        if (listaDeDependentes.add(dependente)) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean Deletar(String matricula) {
        for(Dependente d: listaDeDependentes){
           if (d.getMatricula() == matricula) {
               return listaDeDependentes.remove(d);
           }
       }
       return false;
    }

    @Override
    public boolean editar(Dependente dependente) {
        for(Dependente d : listaDeDependentes){
            if (d.getMatricula()== dependente.getMatricula()) {
                listaDeDependentes.remove(d);
                listaDeDependentes.add(dependente);
                return true;
            }
        }
        return false;
    }

    @Override
    public Set<Dependente> listarDependentes() {
        return listaDeDependentes;
    }

    @Override
    public Dependente buscarPorMatricula(String matricula) {
        for(Dependente d : listaDeDependentes){
            if (d.getMatricula() == matricula) {
                return d;
            }
        }
        return null;
    }
}
