/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Objects;

/**
 *
 * @author Windows
 */
public class Aluno extends Pessoa {
     private String matricula;
    private String anoIngresso;

    public Aluno(String cpf, String nome, String idade, String matricula, String anoIngresso) {
        super(cpf, nome, idade);
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
    }
    
    public Aluno() {
        super();
        this.matricula = "";
        this.anoIngresso = "";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(String anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.matricula);
        hash = 73 * hash + Objects.hashCode(this.anoIngresso);
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return Objects.equals(this.anoIngresso, other.anoIngresso);
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", anoIngresso=" + anoIngresso + '}';
    }
    
}
    

