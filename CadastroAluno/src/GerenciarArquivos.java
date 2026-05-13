
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciarArquivos {
    public List<Aluno> carregarDadosDaPlanilha(String filename) throws FileNotFoundException, IOException
    {
        List<Aluno> listaAluno = new ArrayList<Aluno>();
        BufferedReader leitor = new BufferedReader(new FileReader(new File(filename)));
        
        String line = leitor.readLine();
        
        while (line != "EOF")
        {
            System.out.println(line);
            line = leitor.readLine();
        }
        return listaAluno;
            
    }
    public static void main(String[] args){
        GerenciarArquivos gerenciar = new GerenciarArquivos();
        try{
        gerenciar.carregarDadosDaPlanilha("Alunos.csv");
        }
        catch (IOException ex){
            System.out.println("Não carregou o arquivo");
        }
        
    }
}
