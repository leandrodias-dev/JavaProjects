/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newlampada;

/**
 *
 * @author 12525177037
 */
public class NewLampada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lampada objetoLampada = new Lampada();
        
        objetoLampada.nome = "Lampada LED";
        objetoLampada.cor = "Branco frio";
        objetoLampada.potencia = 45;
        
        
        System.out.println("Nome: " + objetoLampada.nome);
        System.out.println("Cor: " + objetoLampada.cor);
        System.out.println("Potência: " + objetoLampada.potencia);
    }
    
}
