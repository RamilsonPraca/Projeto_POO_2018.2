/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.visão;

import com.ifpb.SGC.Dao.CadastroLoginDaoImplem;
import com.ifpb.SGC.Dao.CervejaDaoImplem;
import com.ifpb.SGC.Dao.ClienteDaoImplem;
import com.ifpb.SGC.modelo.Cerveja;
import com.ifpb.SGC.modelo.Cliente;
import com.ifpb.SGC.modelo.Login;

/**
 *
 * @author ramil
 */
public class App {
    public static void main(String[] args){
        Login login1 = new Login("Ramilson4406", "123456");
        Login login2 = new Login("Ramilson", "1234567");
        CadastroLoginDaoImplem cadastroLogin = new CadastroLoginDaoImplem();
        
        System.out.println(cadastroLogin.salvar(login1));
        System.out.println(cadastroLogin.salvar(login2));
        
        System.out.println(cadastroLogin.entrar("Ramilson", "1234567"));
        
    }
}
