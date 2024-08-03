/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

import Interface.Produtos;

/**
 *
 * @author Windows
 */

public class Alimento extends Produto implements Produtos {
    
    public Alimento(String nome, double preco) {
        super(nome, preco);
    }
    
    @Override
    public void calcularDesconto(double valor){
        super.setValorFinal(super.getPreco() - valor);
    }
    
    @Override
    public void Imprimir(){
        super.Imprimir();   
    }
}

    

