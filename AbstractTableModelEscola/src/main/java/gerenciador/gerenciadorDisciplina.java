/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciador;

import Classes.Disciplina;
import java.util.ArrayList;
import java.util.List;
import serializador.SerializadorCSVDisc;
import serializador.filePersistence;

/**
 *
 * @author Windows
 */
public class gerenciadorDisciplina {
     private List<Disciplina> disciplina;

    public gerenciadorDisciplina() {
        this.disciplina = new ArrayList<>();
    }
    
    public void addDisciplina(Disciplina newDisciplina){
        disciplina.add(newDisciplina);
    }
    
    public Disciplina buscarDisciplina(String nome){
        for(Disciplina discip : disciplina){
            if(discip.getNome().equals(nome)){
                return discip;
            }
        }
        return null;        
    }
    
    public void atualizarDisciplina(String nome, Disciplina newDiscip){
        Disciplina discipExistente = buscarDisciplina(nome);
        if(discipExistente != null){
            int indice = disciplina.indexOf(discipExistente);
            disciplina.set(indice, newDiscip);
            System.out.println("Atualizada");
        }else{
            System.out.println("Não tem disciplina: " + nome);
        }
    }
    
    public void removeDisciplina(String nome){
        disciplina.remove(buscarDisciplina(nome));
        System.out.println("Removida");
    }

    @Override
    public String toString() {
        return "gerenciadorDisciplina{" + "disciplina=" + disciplina + '}';
    }
    
    public List<Disciplina> getDisciplinas(){
        return disciplina;
    }
    
    public void salvarNoArquivo(String caminhoDoArquivo) {
        SerializadorCSVDisc serializador = new SerializadorCSVDisc();
        String csvData = serializador.toCSV(disciplina);

        filePersistence filePersistence = new filePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Disciplina salva em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
       filePersistence FilePersistence = new filePersistence();
       String csvData = FilePersistence.loadFromFile(caminhoDoArquivo);

       SerializadorCSVDisc serializador = new SerializadorCSVDisc();
       this.disciplina = serializador.fromCSV(csvData);

       System.out.println("Disciplinas carregados de " + caminhoDoArquivo);
    }
    
}
