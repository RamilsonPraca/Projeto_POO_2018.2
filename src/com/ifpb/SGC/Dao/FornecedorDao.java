/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.Dao;

import com.ifpb.SGC.modelo.FornecedorIngrediente;
import java.util.Set;

/**
 *
 * @author ramil
 */
public interface FornecedorDao {
    public boolean salvar(FornecedorIngrediente fornecedor);
    public boolean Deletar(String CNPJ);
    public boolean editar (FornecedorIngrediente fornecedor);
    public Set<FornecedorIngrediente> listarFornecedores();
    public FornecedorIngrediente buscarPorCNPJ(String CNPJ);
}

