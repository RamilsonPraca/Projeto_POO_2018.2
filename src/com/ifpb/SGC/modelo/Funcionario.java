/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ramil
 */
public class Funcionario implements Serializable{
    private String matricula;
    private String nome;
    private String endereço;
    private String dataNascimento;
    private String dataAdmissão;
    private String sexo;
    private float salario;

    public Funcionario(String matricula, String nome, String endereço, String dataNascimento, String dataAdmissão, String sexo, float salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereço = endereço;
        this.dataNascimento = dataNascimento;
        this.dataAdmissão = dataAdmissão;
        this.sexo = sexo;
        this.salario = salario;
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

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataAdmissão() {
        return dataAdmissão;
    }

    public void setDataAdmissão(String dataAdmissão) {
        this.dataAdmissão = dataAdmissão;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.matricula);
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
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "(" + "matricula = " + matricula + ", nome = " + nome + ", endereço = " + endereço + ", data de nascimento = " + 
                dataNascimento + ", dataAdmissão = " + dataAdmissão + ", sexo = " + sexo + ", salario = " + salario + ") \n ";
    }

    
    
}
