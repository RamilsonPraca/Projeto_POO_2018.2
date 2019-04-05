/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.Dao;

import com.ifpb.SGC.modelo.FornecedorIngrediente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ramil
 */
public class FornecedorDaoImplem implements FornecedorDao{
    Set<FornecedorIngrediente> listaDefornecedor;
    
    public FornecedorDaoImplem(){
        listaDefornecedor = new HashSet<>();
    }

    @Override
    public boolean salvar(FornecedorIngrediente fornecedor) {
        if(listaDefornecedor.add(fornecedor)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean Deletar(String CNPJ) {
        for(FornecedorIngrediente f : listaDefornecedor){
            if(f.getCNPJ() == CNPJ){
                listaDefornecedor.remove(f);
            }
        }
        return false;
    }

    @Override
    public boolean editar(FornecedorIngrediente fornecedor) {
        for(FornecedorIngrediente f : listaDefornecedor){
            if(f.getCNPJ() == fornecedor.getCNPJ()){
                listaDefornecedor.remove(f);
                listaDefornecedor.add(fornecedor);
                return true;
            }
        }
        return false;
    }

    @Override
    public Set<FornecedorIngrediente> listarCervejas() {
        return listaDefornecedor;
    }

    @Override
    public FornecedorIngrediente buscarPorCodigo(String CNPJ) {
        for(FornecedorIngrediente f : listaDefornecedor){
            if(f.getCNPJ() == CNPJ){
                return f;
            }
        }
        return null;
    }
}
