/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.Dao;

import com.ifpb.SGC.modelo.Cliente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ramil
 */
public class ClienteDaoImplem implements ClienteDao {
    
    private Set<Cliente> listaDeCliente;
    
    public ClienteDaoImplem(){
        listaDeCliente = new HashSet<>();
    }

    @Override
    public boolean salvar(Cliente cliente) {
        if (listaDeCliente.add(cliente)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean Deletar(String cpf) {
       for(Cliente c : listaDeCliente){
           if (c.getCpf() == cpf) {
               listaDeCliente.remove(c);
           }
       }
       return false;
    }

    @Override
    public boolean editar(Cliente cliente) {
        for(Cliente c : listaDeCliente){
            if (c.getCpf() == cliente.getCpf()) {
                listaDeCliente.remove(c);
                listaDeCliente.add(cliente);
                return true;
            }
        }
        return false;
    }

    @Override
    public Set<Cliente> listarClientes() {
        return listaDeCliente;
    }

    @Override
    public Cliente buscarPorCodigo(String cpf) {
        for(Cliente c : listaDeCliente){
            if (c.getCpf() == cpf) {
                return c;
            }
        }
        return null;
    }
    
}
