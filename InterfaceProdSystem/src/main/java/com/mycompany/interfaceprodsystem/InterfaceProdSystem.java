/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaceprodsystem;

import Classe.Alimento;
import Classe.Eletronicos;
import Classe.Roupa;

/**
 *
 * @author Windows
 */
public class InterfaceProdSystem {

    public static void main(String[] args) {
       Eletronicos elet = new Eletronicos("Geladeira", 1000.00);
        Roupa roupa = new Roupa("Camisa Branca Basica", 100.00);
        Alimento alim = new Alimento("Porção de Sushi", 80);
        
        elet.Imprimir();
        roupa.Imprimir();
        alim.Imprimir();
        
        //adiciono o DESCONTO
        elet.calcularDesconto(199.00);
        roupa.calcularDesconto(45);
        alim.calcularDesconto(20);
        
        System.out.println("DESCONTO APLICADO");
        elet.Imprimir();
        roupa.Imprimir();
        alim.Imprimir();
    }
}
