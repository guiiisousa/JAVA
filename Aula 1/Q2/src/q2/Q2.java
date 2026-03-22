/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q2;
import java.util.Scanner;

/**
 *
 * @author guiso
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sca = new Scanner(System.in);
     
        
        System.out.println("Digite seu nome: ");
        String nome = sca.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = sca.nextInt();
        
        System.out.println("Digite sua altura: ");
        double altura = sca.nextDouble();
        
        System.out.println("Sua altura: "+altura);
        System.out.println("Seu nome: "+nome);
        System.out.println("Sua Idade: "+idade);
    }
    
}
