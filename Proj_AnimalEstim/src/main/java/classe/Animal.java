/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

import java.util.Objects;

/**
 *
 * @author 14626232639
 */
public class Animal {
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private Double peso;

    public Animal(String especie, String raca, int idade, Double peso, String nome) {
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.nome = nome;
    }
    
    public Animal() {
        this.nome = "";
        this.especie = "";
        this.raca = "";
        this.idade = 0;
        this.peso = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    public void imprimir(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", especie=" + especie + ", raca=" + raca + ", idade=" + idade + ", peso=" + peso + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.especie);
        hash = 97 * hash + Objects.hashCode(this.raca);
        hash = 97 * hash + this.idade;
        hash = 97 * hash + Objects.hashCode(this.peso);
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
        final Animal other = (Animal) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.especie, other.especie)) {
            return false;
        }
        if (!Objects.equals(this.raca, other.raca)) {
            return false;
        }
        return Objects.equals(this.peso, other.peso);
    }

   
    
    
    
}
