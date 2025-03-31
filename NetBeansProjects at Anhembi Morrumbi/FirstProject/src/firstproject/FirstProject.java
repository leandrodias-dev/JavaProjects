/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstproject;

/**
 *
 * @author 12525177037
 */
public class FirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa objetoPessoa = new Pessoa ();
        
        //insere dados
        objetoPessoa.nome = "Leandro";
        objetoPessoa.idade = 28;
        objetoPessoa.altura = 1.75;
        
        // Saída de dados
        
        System.out.println("Nome: " + objetoPessoa.nome);
        System.out.println("Idade: " + objetoPessoa.idade);
        System.out.println("Altura: " + objetoPessoa.altura);
    }
    
}
