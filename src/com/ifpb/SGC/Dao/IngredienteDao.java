/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.Dao;

import com.ifpb.SGC.modelo.Ingrediente;
import java.util.Set;

/**
 *
 * @author ramil
 */
public interface IngredienteDao {
    public boolean salvar(Ingrediente ingrediente);
    public boolean Deletar(int codigo);
    public boolean editar (Ingrediente ingrediente);
    public Set<Ingrediente> listarCervejas();
    public Ingrediente buscarPorCodigo(int codigo);
}
