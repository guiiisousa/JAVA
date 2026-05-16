/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadecontabancaria;

/**
 *
 * @author cliente
 */
public class FuncoesConta {
    public double depositarDinheiro(double dinheiro,ContaBancaria banco){
        return banco.saldo += dinheiro;
    }
    public double sacarDinheiro(double dinheiro, ContaBancaria banco){
        
        if (banco.saldo < 0 || dinheiro > banco.saldo){
            System.out.println("Valor incorreto");
            return banco.saldo;
        }
        else{
            return banco.saldo -= dinheiro;
        }
    }
    public String mostrarInformações(ContaBancaria banco){
        return ("Conta numero: "+banco.getNumeroConta()+"\nProprietario: "+banco.getNome()+"\nSaldo: R$"+banco.getSaldo());
    }
}
