/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadecontabancaria;

import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class SistemaDeContaBancaria {

    public static void main(String[] args) {
        ContaBancaria banco = new ContaBancaria(123, "Fernando", 0);
        FuncoesConta funções = new FuncoesConta();
        
        System.out.println(funções.mostrarInformações(banco));
        
        Scanner scan = new Scanner(System.in);
        
        while (true){
        System.out.println("Digite o que quer fazer? (1-mostrar informacoes, 2-Depositar, 3-Sacar, 4-Fechar)");
        int decisão = scan.nextInt();
        
        switch (decisão) {
            case 1:
                System.out.println(funções.mostrarInformações(banco));
                break;
            case 2:
                {
                    System.out.println("Digite o valor para deposito:");
                    double valor = scan.nextDouble();
                    System.out.println("Saldo anterior: R$"+banco.saldo+"\nSaldo atual: R$"+funções.depositarDinheiro(valor, banco));
                    break;
                }
            case 3:
                {
                    System.out.println("Digite o valor para sacar:");
                    double valor = scan.nextDouble();
                    if(valor > banco.saldo){
                        System.out.println(funções.sacarDinheiro(valor, banco));
                        break;
                    }
                    else{
                        System.out.println("Saldo anterior: R$"+banco.saldo+"\nSaldo atual: R$"+funções.sacarDinheiro(valor, banco));
                        break;
                    }
                    
                }
            case 4:
            {
                System.out.println("Obrigado por usar o programa");
                return;
            }
            default:
                System.out.println("Digite um valor correto");
                break;
        }
    }
   }
    
}
