/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.Dao;

import com.ifpb.SGC.modelo.Cliente;
import java.util.Set;

/**
 *
 * @author ramil
 */
public interface ClienteDao {
    public boolean salvar(Cliente cliente);
    public boolean Deletar(String cpf);
    public boolean editar (Cliente cliente);
    public Set<Cliente> listarClientes();
    public Cliente buscarPorCodigo(String cpf);
}
