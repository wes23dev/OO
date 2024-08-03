/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaceveiculossistem;

import classe.Carro;
import classe.Moto;
import classe.Veiculo;

/**
 *
 * @author Windows
 */
public class InterfaceVeiculosSistem {

    public static void main(String[] args) {
      Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        aceleraOsTrem(moto);
        aceleraOsTrem(carro);
        calculaOsTrem(moto);
        calculaOsTrem(carro);
    }

    static void aceleraOsTrem(Veiculo veiculo) {
        veiculo.acelerar();
    }

    static void calculaOsTrem(Veiculo veiculo) {
        double preco = veiculo.calcula_valor();
        System.out.println("O preço desse veiculo e: " + preco);
    }
}
    

