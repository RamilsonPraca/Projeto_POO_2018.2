/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.Dao;

import com.ifpb.SGC.modelo.Cerveja;
import java.util.Set;

/**
 *
 * @author ramil
 */
public interface CervejaDao {
    public boolean salvar(Cerveja cerveja);
    public boolean Deletar(int codigo);
    public boolean editar (Cerveja cerveja);
    public Set<Cerveja> listarCervejas();
    public Cerveja buscarPorCodigo(int codigo);
}
