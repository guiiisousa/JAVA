
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
        leitor.readLine();
        String line = leitor.readLine();
        
        while (line != "EOF")
        {   
            
            String[] campos = line.split(";");
            int matricula = Integer.parseInt(campos[0]);
            String nome = campos[1];
            String curso = campos[2];
            
            
            Aluno aluno = new Aluno(matricula, nome, curso);
            
            listaAluno.add(aluno);
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
