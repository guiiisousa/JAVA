
package controlarcafetaria;
class Pedido {
    String nome_da_bebida;
    String tamanho;
    double valor_tamanho;
    double valor_bebida;
    int quantidade;
    double valor;

    public Pedido(String nome_da_bebida, String tamanho, double valor_tamanho, double valor_bebida) {
        this.nome_da_bebida = nome_da_bebida;
        this.tamanho = tamanho;
        this.valor_tamanho = valor_tamanho;
        this.valor_bebida = valor_bebida;
    }
    
    public double Calcular_valorTotal(Pedido pedido){
        return pedido.valor_bebida * valor_tamanho;
    }
    public double Calcular_valorTotal_Adicional(Pedido pedido){
        return (pedido.valor_bebida * valor_tamanho)+2.5;
    }
}
