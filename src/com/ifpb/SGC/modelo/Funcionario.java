/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.SGC.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ramil
 */
public class Funcionario {
    private String matricula;
    private String nome;
    private String endereço;
    private LocalDate dataNascimento;
    private LocalDate dataAdmissão;
    private String sexo;
    private float salario;
    private List<Dependente> listaDependentes;

    public Funcionario(String matricula, String nome, String endereço, String sexo, float salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereço = endereço;
        this.dataNascimento = dataNascimento;
        this.dataAdmissão = dataAdmissão;
        this.sexo = sexo;
        this.salario = salario;
        this.listaDependentes = new ArrayList<>();
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataAdmissão() {
        return dataAdmissão;
    }

    public void setDataAdmissão(LocalDate dataAdmissão) {
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

    public List<Dependente> getListaDependentes() {
        return listaDependentes;
    }

    public void setListaDependentes(List<Dependente> listaDependentes) {
        this.listaDependentes = listaDependentes;
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
        return "Funcionario{" + "matricula=" + matricula + ", nome=" + nome + ", endere\u00e7o=" + endereço + ", dataNascimento=" + dataNascimento + ", dataAdmiss\u00e3o=" + dataAdmissão + ", sexo=" + sexo + ", salario=" + salario + ", listaDependentes=" + listaDependentes + '}';
    }

    
    
}
