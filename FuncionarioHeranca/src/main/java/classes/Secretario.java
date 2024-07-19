/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 15102938681
 */
public class Secretario extends Funcionario {
     private List<String> linguasFaladas;

    public Secretario() {
        super();
        this.linguasFaladas = new ArrayList<>();
    }

    public Secretario(String nome, int id, double salario, List<String> linguasFaladas) {
        super(nome, id, salario);
        this.linguasFaladas = linguasFaladas;
    }

    @Override
    public void Preencher() {
        Scanner ler = new Scanner(System.in);
        super.Preencher();
        System.out.print("Línguas Faladas (separadas por vírgula): ");
        this.linguasFaladas =this.linguasFaladas = Arrays.asList(ler.next().split(","));
    }

    public void organizarAgenda() {
        System.out.println("Agenda organizada para o dia!");
    }

    @Override
    public void Imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + "\nLínguas Faladas: " + this.linguasFaladas;
    }

    public List<String> getLinguasFaladas() {
        return linguasFaladas;
    }

    public void setLinguasFaladas(List<String> linguasFaladas) {
        this.linguasFaladas = linguasFaladas;
    }
}
    

