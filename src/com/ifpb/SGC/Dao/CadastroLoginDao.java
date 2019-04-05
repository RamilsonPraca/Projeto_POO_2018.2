/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.Dao;

import com.ifpb.SGC.modelo.Login;

/**
 *
 * @author ramil
 */
public interface CadastroLoginDao {
    public boolean salvar(Login login);
    public boolean entrar(String usuario, String senha);
    
}
