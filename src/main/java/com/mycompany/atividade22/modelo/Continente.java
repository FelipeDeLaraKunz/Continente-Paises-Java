/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade22.modelo;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.atividade22.modelo.Pais;
/**
 *
 * @author felip
 */
public class Continente {
    private String nome;
    private List<Pais> paises = new ArrayList<>();
    
    public Continente(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }
    public double getDimensaoTotal() {
        double total = 0;
        for (Pais p : paises) {
            total += p.getDimensao();
        }
        return total;
    }
    public long getPopulacaoTotal() {
        long total = 0;
        for (Pais p : paises) {
            total += p.getPopulacaoTotal();
        }
        return total;
    }
    public double getDensidadePopulacional() {
        return getPopulacaoTotal() / getDimensaoTotal();
    }
    public Pais getPaisMaisPopuloso() {
        Pais mais = paises.get(0);
        for (Pais p : paises) {
            if (p.getPopulacaoTotal() > mais.getPopulacaoTotal()) {
                mais = p;
            }
        }
        return mais;
    }
    public Pais getPaisMenosPopuloso() {
        Pais menos = paises.get(0);
        for (Pais p : paises) {
            if (p.getPopulacaoTotal() < menos.getPopulacaoTotal()) {
                menos = p;
            }
        }
        return menos;
    }
    public Pais getMaiorPais() {
        Pais maior = paises.get(0);
        for(Pais p : paises) {
            if(p.getDimensao() > maior.getDimensao()) {
                maior = p;
            }
        }
        return maior;
    }
    public Pais getMenorPais() {
        Pais menor = paises.get(0);
        for (Pais p : paises) {
            if (p.getDimensao() < menor.getDimensao()) {
                menor = p;
            }
        }
        return menor;
    }
    public double getRazaoTerritorial() {
        Pais maior = getMaiorPais();
        Pais menor = getMenorPais();
        return maior.getDimensao() / menor.getDimensao();
    }
    
     public String listarPaises() {
    StringBuilder txt = new StringBuilder();
    for (Pais p : paises) {
        txt.append("\n").append(p.getNomePais());
    }
    return txt.toString();
}

}