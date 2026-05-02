/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho_topa;

/**
 *
 * @author betob
 */
import java.util.ArrayList;
import java.util.List;


public class MetodoCantoNoroeste {

    public List<Passo> passos = new ArrayList<>();

    public void resolverProblema(Problema p) {

        int i = 0;
        int j = 0;
        
        // cópias para não alterar o original
        int[] fornecedores = p.fornecedores.clone();
        int[] demanda = p.demanda.clone();

        while (i < fornecedores.length && j < demanda.length) {

            int minimo = Math.min(fornecedores[i], demanda[j]);

            p.alocacao[i][j] = minimo;

            // salva passo
            passos.add(new Passo(i, j, minimo, p.alocacao));

            fornecedores[i] -= minimo;
            demanda[j] -= minimo;

            if (fornecedores[i] == 0 && demanda[j] == 0) {
                i++;
                j++;
            } else if (fornecedores[i] == 0) {
                i++;
            } else {
                j++;
            }
        }
    }
}
