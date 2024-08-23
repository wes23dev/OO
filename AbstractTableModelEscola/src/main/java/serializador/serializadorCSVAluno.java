/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializador;

import Classes.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows
 */
public class serializadorCSVAluno {
      public String toCSV(List<Aluno> alunos) {
        String csv = "Matricula;CPF;Nome;Idade;Ano Ingresso\n"; // Cabeçalho
        for (Aluno aluno : alunos) {
            csv += aluno.getMatricula() + ";"
                    + aluno.getCpf() +";"
                    + aluno.getNome() + ";"
                    + aluno.getIdade() + ";"
                    + aluno.getAnoIngresso() + ";\n";
                    
                    
        }
        return csv;
    }

    //Deserializa uma String no formato CSV para uma lista de alunos
    public List <Aluno> fromCSV(String data) {
        List <Aluno> alunos = new ArrayList<>();

        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >=5 ) {
                // Cria uma nova aluno com os dados da linha
                Aluno a ;
                      a  = new Aluno(
                        partes[0], // Matricula
                        partes[1],  //CPF   
                        partes[2], // Nome
                        partes[3], //idade
                        partes[4]//Ano Ingresso
                      
                );

                // Adiciona a aluno à lista
                alunos.add(a);
            }
        }
        return alunos;
    }

    
}
