/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testesaídaprint;

import java.util.Scanner;

public class TesteSaídaPrint {
    public static void main(String[] args) { 
       
       String nome;
       Scanner entrada = new Scanner(System.in); 
       System.out.println("Digite seu nome: ");
       nome = entrada.nextLine();
       int numero = 0; // variavel
       //String nome = "Leandro";
       String CPF = "123";
       System.out.printf("Valor %s, CPF numero: %s,\n idade: %d no inicio: \n",nome,CPF,numero);
       numero = 27; // atribuição
        
        System.out.printf("Valor no final: "+numero); 
        
    }
    
}
