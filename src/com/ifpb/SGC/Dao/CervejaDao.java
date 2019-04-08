/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.Dao;

import com.ifpb.SGC.modelo.Cerveja;
import java.io.IOException;
import java.util.Set;

/**
 *
 * @author ramil
 */
public interface CervejaDao {
    public boolean salvar(Cerveja cerveja)throws IOException, ClassNotFoundException;
    public boolean Deletar(int codigo)throws IOException, ClassNotFoundException;
    public boolean editar (Cerveja cerveja)throws IOException, ClassNotFoundException;
    public Set<Cerveja> listarCervejas();
    public Cerveja buscarPorCodigo(int codigo);
}
