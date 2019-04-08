/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.Dao;

import com.ifpb.SGC.modelo.Funcionario;
import java.util.Set;

/**
 *
 * @author ramil
 */
public interface FuncionarioDao {
    public boolean salvar(Funcionario funcionario);
    public boolean Deletar(String matricula);
    public boolean editar (Funcionario funcionario);
    public Set<Funcionario> listarFuncionarios();
    public Funcionario buscarPorMatricula(String matricula);
}
