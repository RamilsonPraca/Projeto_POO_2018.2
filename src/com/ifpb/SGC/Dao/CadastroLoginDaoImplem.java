/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.Dao;

import com.ifpb.SGC.modelo.Login;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 *
 * @author ramil
 */
public class CadastroLoginDaoImplem implements CadastroLoginDao{
    Set<Login> listaDeLogin;
    
    public CadastroLoginDaoImplem(){
        listaDeLogin = new HashSet<>(1);
    }

    @Override
    public boolean salvar(Login login) {
        if (listaDeLogin.add(login)) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean entrar(String usuario, String senha) {
        for(Login l : listaDeLogin){
            if(l.getUsuario().equals(usuario) && l.getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }
}