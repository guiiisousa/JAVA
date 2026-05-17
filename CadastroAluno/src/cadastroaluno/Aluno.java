
package cadastroaluno;

public class Aluno {
    String nome;
    int idade;
    int id;
    static int contador= 1;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.id = contador;
        contador++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
