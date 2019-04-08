/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.Dao;

import com.ifpb.SGC.modelo.Dependente;
import java.util.Set;

/**
 *
 * @author ramil
 */
public interface DependenteDao {
    public boolean salvar(Dependente dependente);
    public boolean Deletar(String matricula);
    public boolean editar (Dependente dependente);
    public Set<Dependente> listarDependentes();
    public Dependente buscarPorMatricula(String matricula);
}
