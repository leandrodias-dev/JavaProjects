/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularmedia;

/**
 *
 * @author Leandro Dias
 */
public class CalcularMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno = new Aluno();
        
        // insere dados
        aluno.nome = "leandro";
        aluno.ra = "12525177037";
        aluno.notaN1 = 7.5;
        aluno.notaN2 = 8.0;
        
        // Saída de dados
        System.out.println("Nome: " + aluno.nome);
        System.out.println("RA: " + aluno.ra);
        System.out.println("Nota N1: " + aluno.notaN1);
        System.out.println("Nota N2: " + aluno.notaN2);
        aluno.mostrarDados();
        System.out.println();
    }
    
}
