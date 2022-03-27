/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2ex4;
import java.util.Scanner; 

/**
 *
 * @author ALUNO
 */
public class Lista2Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float raio, altura, area, volume;
        
        
        Scanner leia = new Scanner(System.in);
        System.out.print("Dê o valor do raio");
        raio = leia.nextFloat();
        System.out.print("Dê o valor da altura");
        altura = leia.nextFloat();
        
        area = (float)(Math.PI * 2 *raio *(altura + raio));
        
        volume = (float)(Math.PI*raio*raio*altura);
        
        System.out.println("A area é :");
        System.out.println(area);
        
        System.out.println("O volume é:");
        System.out.println(volume);
        
        
        
        
    }
    
}
