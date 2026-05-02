/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho_topa;
/**
 *
 * @author betob
 */
public class Trabalho_TOPA {
    
  public static void main(String[] args) {

        int[][] custos = {
            {2, 3, 1},
            {5, 4, 8},
            {5, 6, 8}
        };

        int[] fornecedores = {20, 30, 25};
        int[] demanda = {10, 35, 30};

        // 🔴 Validação básica (evita resultado inválido)
        int somaF = 0, somaD = 0;

        for (int f : fornecedores) somaF += f;
        for (int d : demanda) somaD += d;

        if (somaF != somaD) {
            System.out.println("Problema não balanceado!");
            return;
        }

        Problema p = new Problema(custos, fornecedores, demanda);

        MetodoCantoNoroeste metodo = new MetodoCantoNoroeste();
        metodo.resolverProblema(p);

        System.out.println("Matriz de Alocação:");

        for (int i = 0; i < p.alocacao.length; i++) {
            for (int j = 0; j < p.alocacao[i].length; j++) {
                System.out.print(p.alocacao[i][j] + "\t");
            }
            System.out.println();
        }

        int custoTotal = 0;

        for (int i = 0; i < custos.length; i++) {
            for (int j = 0; j < custos[i].length; j++) {
                custoTotal += p.alocacao[i][j] * custos[i][j];
            }
        }

        System.out.println("Custo Total: " + custoTotal);
    }
    
}
