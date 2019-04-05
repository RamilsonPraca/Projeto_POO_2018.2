/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ramil
 */
public class FornecedorIngrediente {
    private String CNPJ;
    private String nome;
    private String contato;
    private List<Ingrediente> IngredientesFornecidos;

    public FornecedorIngrediente(String CNPJ, String nome, String contato) {
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.contato = contato;
        this.IngredientesFornecidos = new ArrayList<>();  
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public List<Ingrediente> getIngredientesFornecidos() {
        return IngredientesFornecidos;
    }

    public void setIngredientesFornecidos(List<Ingrediente> IngredientesFornecidos) {
        this.IngredientesFornecidos = IngredientesFornecidos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.CNPJ);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FornecedorIngrediente other = (FornecedorIngrediente) obj;
        if (!Objects.equals(this.CNPJ, other.CNPJ)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FornecedorIngrediente{" + "CNPJ=" + CNPJ + ", nome=" + nome + ", contato=" + contato + ", IngredientesFornecidos=" + IngredientesFornecidos + '}';
    }
    
}
