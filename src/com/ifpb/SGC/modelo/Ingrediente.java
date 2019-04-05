/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.modelo;

import java.time.LocalDate;

/**
 *
 * @author ramil
 */
public class Ingrediente {
    private int codigo;
    private String nome;
    private LocalDate dataChegada;
    private LocalDate dataVencimento;

    public Ingrediente(int codigo, String nome, LocalDate dataChegada, LocalDate dataVencimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataChegada = dataChegada;
        this.dataVencimento = dataVencimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(LocalDate dataChegada) {
        this.dataChegada = dataChegada;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.codigo;
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
        final Ingrediente other = (Ingrediente) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ingrediente{" + "codigo=" + codigo + ", nome=" + nome + ", dataChegada=" + dataChegada + ", dataVencimento=" + dataVencimento + '}';
    }

    
}
