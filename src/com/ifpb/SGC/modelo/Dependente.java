/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author ramil
 */
public class Dependente implements Serializable{
    private String matricula;
    private String nome;
    private String sexo;
    private String dataNascimento;
    private String parentesco;

    public Dependente(String matricula, String nome, String sexo, String dataNacimento, String parentesco) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.parentesco = parentesco;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.matricula);
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
        final Dependente other = (Dependente) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dependente(" + "matricula = " + matricula + ", nome = " + nome + ", sexo = " + sexo + ", dataNascimento = " + dataNascimento + ", parentesco=" + parentesco + ") \n";
    }
    
    
}
