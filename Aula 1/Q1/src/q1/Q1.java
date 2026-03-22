/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author guiso
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sca = new Scanner(System.in);
     
        
        System.out.println("Digite um numero:");
        int n = sca.nextInt();
        
        if(n % 2 == 0)
        {
            JOptionPane.showMessageDialog(null,"eh par");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"não eh par");
        }
    }
}
