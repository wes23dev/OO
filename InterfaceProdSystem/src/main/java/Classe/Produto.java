/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

/**
 *
 * @author Windows
 */

abstract public class Produto {
    protected String nome;
    protected double preco;
    protected double valorFinal;
    
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.valorFinal = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
    
    public void Imprimir(){
        System.out.println(nome + ", R$" + valorFinal);
        valorFinal = preco;
    }
    


}
