/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package informationphone;

/**
 *
 * @author Leandro Dias
 */

import java.util.Scanner;
public class InformationPhone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Smartphone objetoSmartphone = new Smartphone();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a marca: ");
        objetoSmartphone.marca = entrada.nextLine();
        System.out.println("Digite o modelo: ");
        objetoSmartphone.modelo = entrada.nextLine();
        System.out.println("Digite a cor: ");
        objetoSmartphone.cor = entrada.nextLine();
        System.out.println("Digite o armazenamento: ");
        objetoSmartphone.armazenamento = entrada.nextInt();
        System.out.println("Digite o tamanho da tela: ");
        objetoSmartphone.tela = entrada.nextDouble();
        
        System.out.println("Informações do aparelho: ");
        System.out.printf("\nMarca: %s \nModelo: %s \nCor: %s" 
                +" \nArmazenamento: %d \nTamanho da tela: %f",
        
        objetoSmartphone.marca, objetoSmartphone.modelo, objetoSmartphone.cor,
        objetoSmartphone.armazenamento, objetoSmartphone.tela);
    }
    
}
