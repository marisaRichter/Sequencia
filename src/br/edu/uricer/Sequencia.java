/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

import java.util.TreeSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class Sequencia {
    
    private TreeSet<Integer> valores = new TreeSet<Integer>();
    
    public Sequencia() {
    }
    
    public int getMinimo(){
        int minimo;
        minimo = valores.first();
        return minimo;
    }
    
    public int getMaximo(){
        int maximo;
        maximo = valores.last();
        return maximo;
    }
    
    public int getSize(){
        int tam;
        tam = valores.size();
        return tam;
    }
    
    public double getMedia(){
        double media;
        double soma = 0;
        int tam = valores.size();
        for(int i : valores){
            soma = soma + i;
        }
        media = soma/tam;
        return media;
    }
    
    public Set getValores() {
        return valores;
    }

    public void setValores(int value) {
        valores.add(value);
    }
    
}
