/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sequencia valores = new Sequencia();
        String entrada;
        
        while(true){
            System.out.println("Informe quantos valores achar necessário, ao terminar digite 'OK', ou 'exit' para sair");
            entrada = sc.nextLine();
            if(entrada.equals("exit")){
                break;
            } else{
                while(!entrada.equals("OK")){
                    int number = Integer.parseInt(entrada);
                    valores.setValores(number);
                    entrada = sc.nextLine();
                }

                System.out.println("- Valor Mínimo: " + valores.getMinimo());
                System.out.println("- Valor Mínimo: " + valores.getMaximo());
                System.out.println("- Valor Mínimo: " + valores.getSize());
                System.out.println("- Valor Mínimo: " + valores.getMedia());
            }
        }
        
    }
    
}
