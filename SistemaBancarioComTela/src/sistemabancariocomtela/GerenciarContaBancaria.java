/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancariocomtela;

public class GerenciarContaBancaria {
    public double depositar(double dinheiro ,ContaBancaria conta){
        return conta.saldo += dinheiro;
        
    }
    public double sacar(double dinheiro, ContaBancaria conta){
        if(dinheiro>conta.saldo){
            return conta.saldo;
        }
        else{
            return conta.saldo-=dinheiro;
        }
    }
}
