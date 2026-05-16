/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadecelular;

/**
 *
 * @author cliente
 */
public class SistemaDeCelular {

    public static void main(String[] args) {
        Celular celular = new Celular("Redmi","Note 12s", -1);
        FunçõesCelular funções = new FunçõesCelular();
        
        System.out.println(funções.ligar(celular));
    }    
    
}
