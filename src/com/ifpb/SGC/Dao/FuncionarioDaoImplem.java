/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.Dao;

import com.ifpb.SGC.modelo.Funcionario;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ramil
 */
public class FuncionarioDaoImplem implements FuncionarioDao{
    Set<Funcionario> listaDeFuncionario;
    
    public FuncionarioDaoImplem(){
        listaDeFuncionario = new HashSet<>();
    }

    @Override
    public boolean salvar(Funcionario funcionario) {
        if (listaDeFuncionario.add(funcionario)) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean Deletar(String matricula) {
        for(Funcionario f : listaDeFuncionario){
            if (f.getMatricula() == matricula) {
                listaDeFuncionario.remove(f);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean editar(Funcionario funcionario) {
        for(Funcionario f : listaDeFuncionario){
            if(f.getMatricula() == funcionario.getMatricula()){
                listaDeFuncionario.remove(f);
                listaDeFuncionario.add(funcionario);
                return true;
            }
        }
        return false;
    }

    @Override
    public Set<Funcionario> listarFuncionarios() {
        return listaDeFuncionario;
    }

    @Override
    public Funcionario buscarPorMatricula(String matricula) {
        for(Funcionario f : listaDeFuncionario){
            if(f.getMatricula() == matricula){
                return f;
            }
        }
        return null;
    }
}
