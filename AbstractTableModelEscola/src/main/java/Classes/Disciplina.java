/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Windows
 */
public class Disciplina {
     private String nome;
    private String semestre;
    private String horario;
    private String profM;
    private List<Aluno> alunos = new ArrayList<>();

    public Disciplina(String nome, String semestre, String horario, String profM) {
        this.nome = nome;
        this.semestre = semestre;
        this.horario = horario;
        this.profM = profM;
    }
    
    public Disciplina() {
        this.nome = "";
        this.semestre = "";
        this.horario = "";
        this.profM = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getProfM() {
        return profM;
    }

    public void setProfM(String profM) {
        this.profM = profM;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.nome);
        hash = 73 * hash + Objects.hashCode(this.semestre);
        hash = 73 * hash + Objects.hashCode(this.horario);
        hash = 73 * hash + Objects.hashCode(this.profM);
        hash = 73 * hash + Objects.hashCode(this.alunos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disciplina other = (Disciplina) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.semestre, other.semestre)) {
            return false;
        }
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        if (!Objects.equals(this.profM, other.profM)) {
            return false;
        }
        return Objects.equals(this.alunos, other.alunos);
    }
    
    public void imprimir(){
        System.out.println(toString());          
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", semestre=" + semestre + ", horario=" + horario + ", profM=" + profM + ", alunos=" + alunos + '}';
    } 
    
    
}
