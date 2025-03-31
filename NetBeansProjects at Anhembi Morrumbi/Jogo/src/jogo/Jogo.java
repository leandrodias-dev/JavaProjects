/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogo;

/**
 *
 * @author Leandro Dias
 */
import java.util.Scanner;
import java.util.Random;
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite seu nome: ");
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        String nome = teclado.nextLine();
        System.out.println("Digite o número da aposta (de 1 a 10)");
        int aposta = teclado.nextInt(); // Ler teclado
        int sorteado = random.nextInt(1,11); // Gerar números aleatórios. Sempre colocar um número a mis do que o sorteio
        
        if (aposta == sorteado) {
            System.out.println(nome + "Você acertou!");
        }else{
            System.out.println(nome + "Você errou!");
            System.out.println("O número sorteado era: " + sorteado);
        }
    }
    
}
