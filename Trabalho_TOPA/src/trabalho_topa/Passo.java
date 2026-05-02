/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho_topa;

/**
 *
 * @author guiso
 */
public class Passo {
    public int i;
    public int j;
    public int valor;
    public int[][] estado;

    public Passo(int i, int j, int valor, int[][] estado) {
        this.i = i;
        this.j = j;
        this.valor = valor;

        // copia da matriz
        this.estado = new int[estado.length][estado[0].length];
        for (int x = 0; x < estado.length; x++) {
            for (int y = 0; y < estado[0].length; y++) {
                this.estado[x][y] = estado[x][y];
            }
        }
    }
}