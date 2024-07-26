/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Funcionario {
    
    protected String nome;
    protected int id;
    protected double salario;
    
     public Funcionario() {
        this.nome = "";
        this.id = 0;
        this.salario = 0.0;
        
    }

    public Funcionario(String nome, int id, double salario)throws ExceptionsSalario {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        
    }

    public void Preencher() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Nome: ");
        this.nome = ler.nextLine();
        System.out.print("ID: ");
        this.id = ler.nextInt();
        System.out.print("Salário: ");
        this.salario = ler.nextDouble();
        
       
    }
    
     public void setSalario(double salario) throws ExceptionsSalario {
        if (salario <= 0) {
            throw new ExceptionsSalario("O salário não pode ser menor ou igual a zero.");
        }
        this.salario = salario;
    }

    public void Imprimir() {
        System.out.println(toString());
    }

    public void aumentarSalario() {// Aumento padrão de 5%
        this.salario += this.salario * 0.05; 
    }

    @Override
    public String toString() {
        String Funcionario = "Nome: " + this.nome + "\nID: " + this.id + "\nSalário: R$ " + this.salario;
        return Funcionario;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }


}
