/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho_topa;

/**
 *
 * @author betob
 */
public class Problema {
    
    int[][] custos;
    int[] fornecedores; 
    int[] demanda; 
    int[][] alocacao; 
    
    public Problema(int[][] custos, int[] fornecedores, int[] demanda)
    {
        this.custos = custos; 
        this.fornecedores = fornecedores; 
        this.demanda = demanda; 
        this.alocacao = new int[custos.length][custos[0].length]; 
    }
    
}
