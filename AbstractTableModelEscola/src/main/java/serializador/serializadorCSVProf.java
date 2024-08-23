/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializador;

import Classes.Professor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows
 */
public class serializadorCSVProf {
     public String toCSV(List<Professor> profs) {
        String csv = "Nome;Idade;Sexo;CPF\n"; // Cabeçalho
        for (Professor prof : profs) {
            csv +=    prof.getNome() + ";"
                    + prof.getIdade() + ";"
                    + prof.getSexo()+";"
                    + prof.getCpf()+ ";\n";
                    
                    
        }
        return csv;
    }

    //Deserializa uma String no formato CSV para uma lista de profs
    public List <Professor> fromCSV(String data) {
        List <Professor> profs = new ArrayList<>();

        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >=4 ) {
                // Cria uma nova prof com os dados da linha
                Professor profe ;
                profe = new Professor(
                       partes[0],
                       partes[1],
                       partes[2],
                       partes[3]
               
                );

                // Adiciona a prof à lista
                profs.add(profe);
            }
        }
        return profs;
    }
    
}
