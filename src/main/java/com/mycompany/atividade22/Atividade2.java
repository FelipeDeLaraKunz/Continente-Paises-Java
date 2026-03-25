/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade22;
import javax.swing.JOptionPane;
import com.mycompany.atividade22.modelo.Continente;
import com.mycompany.atividade22.modelo.Pais;

import java.util.Scanner;
/**
 *
 * @author felip
 */
public class Atividade2 {

    public static void main(String[] args) {
        int resposta;
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Digite o nome de um continente: ");
       // String nomeContinente = scanner.next();
       String nomeContinente = JOptionPane.showInputDialog("Digite um continente:");
        Continente continente = new Continente(nomeContinente);
        
        do {
            String nomePais = JOptionPane.showInputDialog("Digite um país:");
            String dimensaoent = JOptionPane.showInputDialog("Digite a dimensão(km²)do/a "+ nomePais+ ":");
            double dimensao = Double.parseDouble(dimensaoent);
            String popent = JOptionPane.showInputDialog("Digite a população total do/a "+ nomePais+ ":");
            Long populacaoTotal = Long.parseLong(popent);
            Pais a = new Pais(nomePais, dimensao, populacaoTotal);
            continente.adicionarPais(a);    
            
            resposta = JOptionPane.showConfirmDialog(null,"Deseja adicionar outro país?", null,JOptionPane.YES_NO_OPTION);
        }while(resposta == JOptionPane.YES_OPTION);
      
        
        String msg = "====="+ continente.getNome()+ "=====\n"
                +"Países:\n" + continente.listarPaises()
                +"\n"
                +"\nPopulação total: " + continente.getPopulacaoTotal()
                +"\nDimensão total: "+ continente.getDimensaoTotal()
                +"\nDensidade populacional: "+ continente.getDensidadePopulacional()
                +"\nPaís mais populoso: " + continente.getPaisMaisPopuloso().getNomePais()
                +"\nPaís menos populoso: " + continente.getPaisMenosPopuloso().getNomePais()
                +"\nMaior país: " + continente.getMaiorPais().getNomePais()
                +"\nMenor país: " + continente.getMenorPais().getNomePais()
                +"\nRazão territorial: "+ continente.getRazaoTerritorial();
        JOptionPane.showMessageDialog(null, msg);            
        }
    }