/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcularmedia;

/**
 *
 * @author Leandro Dias
 */
public class Aluno {
    
    //Atributos
    
    String nome;
    String ra; // RA (Registro do Aluno)
    double notaN1;
    double notaN2;
    
// Método para calcular a média final   
public double calcularMedia() {
    return (notaN1 + notaN2) / 2;
}

// Método para mostrar os dados do aluno
public void mostrarDados() {
    System.out.println("Nome: " + nome);
    System.out.println("RA: " + ra);
    System.out.println("Nota N1: "+ notaN1);
    System.out.println("Nota N2: " + notaN2);
    System.out.println("Média Final: " + calcularMedia());
}
}
