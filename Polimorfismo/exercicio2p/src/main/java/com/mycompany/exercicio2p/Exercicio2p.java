/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2p;

import abstracts.meioPagamento;
import classes.Boleto;
import classes.cartaodeCredito;
import classes.cartaodeDebito;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Exercicio2p {

    public static void main(String[] args) {
        meioPagamento cartaoCredito = new cartaodeCredito();
        meioPagamento cartaoDebito = new cartaodeDebito();
        meioPagamento boleto = new Boleto();
        
        pagar(cartaoCredito);
        pagar(cartaoDebito);
        pagar(boleto);
    }
    
    static void pagar(meioPagamento m){
        double valor = 0.0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Valor do pagamento: ");
        if (ler.hasNextDouble()) {
            valor = ler.nextDouble();
        } else {
            System.out.println("Valor inválido.");
            return;
        }
        m.efetuarPagamento(valor);
    }
    }

