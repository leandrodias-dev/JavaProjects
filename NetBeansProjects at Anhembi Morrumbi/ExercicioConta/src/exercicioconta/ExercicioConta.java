/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioconta;

/**
 *
 * @author 12525177037
 */
import java.util.Scanner;

public class ExercicioConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente objetoContaCorrente = new ContaCorrente();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o número da conta: ");
        int numero = entrada.nextInt();
        objetoContaCorrente.setNumero(numero);
        
        entrada.nextLine();
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        objetoContaCorrente.setNome(nome);
        
        System.out.println("Saldo: " + objetoContaCorrente.getSaldo());
        System.out.println("Digite o valor do saque: ");
        double valor = entrada.nextDouble();
        objetoContaCorrente.sacar(valor);
        
        System.out.println("Digite o valor do deposito: ");
        double deposito = entrada.nextDouble();
        objetoContaCorrente.depositar(deposito);
        System.out.println("Saldo: " + objetoContaCorrente.getSaldo());
        System.out.println("Digite o valor do saque: ");
        valor = entrada.nextDouble();
        objetoContaCorrente.sacar(valor);
        System.out.println("Saldo: " + objetoContaCorrente.getSaldo());
    }
    
}
