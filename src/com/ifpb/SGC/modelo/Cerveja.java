/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ramil
 */
public class Cerveja {
    private int codigo;
    private float preço;
    private String nome;
    private String descrição;
   

    public Cerveja(int codigo, float preço, String nome, String descrição) {
        this.codigo = codigo;
        this.preço = preço;
        this.nome = nome;
        this.descrição = descrição;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.codigo;
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
        final Cerveja other = (Cerveja) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cerveja{" + "codigo = " + codigo + ", preço = " + preço + ", nome = " + nome + ", descrição = " + descrição + '}';
    }
    
    
    
    
}
