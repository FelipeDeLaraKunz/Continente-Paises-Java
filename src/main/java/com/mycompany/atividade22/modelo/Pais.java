/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade22.modelo;

/**
 *
 * @author felip
 */
public class Pais {
    private String nomePais;
    private double dimensao;
    private long populacaoTotal;
    
    public Pais(String nome, double dimensao, long populacao) {
        this.nomePais = nome;
        this.dimensao = dimensao;
        this.populacaoTotal = populacao;
    }

    public String getNomePais() {
        return nomePais;
    }

    public double getDimensao() {
        return dimensao;
    }

    public long getPopulacaoTotal() {
        return populacaoTotal;
    }
    
    @Override
public String toString() {
    return nomePais + " | População: " + populacaoTotal + " | Dimensão: " + dimensao;
}
}

