/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioconta;

/**
 *
 * @author 12525177037
 */
public class ContaCorrente {
    // Atributo
    
    private int numero;
    private String nome;
    private double saldo;
    
    
    // Comportamentos
    public int getNumero() { // Metodo get devolve uma informação e O método não tem parâmetros
    return this.numero;
}
    public void setNumero(int numero){ // Metodo set recebe uma informação e recebe um parâmetro ()
    this.numero = numero;
    }
    
     public String getNome(){ // get sempre terá retorno
        return this.nome;
    }
    public void setNome(String nome){ // set não tem retorno(void)
        this.nome = nome;
    }
    
    // Metodo depositar
    public void depositar(double valor){
         this.saldo = this.saldo + valor * 1.1;
    }
    
    // Metodo para sacar
    public void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo = saldo - valor; // Atualização de saldo
        }else {
            System.out.println("Saldo insulficiente!");
        }
    }
    // Metodo para retorna o saldo
     public double getSaldo(){
         return this.saldo;
     }
}
