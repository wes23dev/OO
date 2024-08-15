/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio4_monei;

import classe.ConversorMoedaReal;
import classe.ServicoFinanceiro;
import classe.conversorMoedaDolar;
import interfaces.IConversorMoeda;

/**
 *
 * @author 15102938681
 */
public class Exercicio4_Monei {

    public static void main(String[] args) {
       IConversorMoeda conversorReal = new ConversorMoedaReal();
       IConversorMoeda conversorDolar = new conversorMoedaDolar();
       
       ServicoFinanceiro servicoR = new ServicoFinanceiro(conversorReal);
       ServicoFinanceiro servicoD = new ServicoFinanceiro(conversorDolar);
       servicoR.realizarTransacao(150.0);
       servicoD.realizarTransacao(200.0);
    }
}
