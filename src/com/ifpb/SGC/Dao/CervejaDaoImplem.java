/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.Dao;

import com.ifpb.SGC.modelo.Cerveja;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ramil
 */
public class CervejaDaoImplem implements CervejaDao{
    private Set<Cerveja> listaDeCervejas;

    public CervejaDaoImplem() {
        listaDeCervejas = new HashSet<>();
    }

    @Override
    public boolean salvar(Cerveja cerveja) {
        if (listaDeCervejas.add(cerveja)) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean Deletar(int codigo) {
       for(Cerveja c: listaDeCervejas){
           if (c.getCodigo()==codigo) {
               return listaDeCervejas.remove(c);
           }
       }
       return false;
    }

    @Override
    public boolean editar(Cerveja cerveja) {        
        for (Cerveja c : listaDeCervejas){
            if(c.getCodigo() == cerveja.getCodigo()){
                listaDeCervejas.remove(c);
                listaDeCervejas.add(cerveja);
                return true;
            }
        }
        return false;
    }

    @Override
    public Set<Cerveja> listarCervejas() {
        return listaDeCervejas;
    }

    @Override
    public Cerveja buscarPorCodigo(int codigo) {
        for(Cerveja c: listaDeCervejas){
            if (c.getCodigo() == codigo) {
                return c;
            }
        }
        return null;
    }
    
    
}
