/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

import interfaces.IConversorMoeda;

/**
 *
 * @author 15102938681
 */
public class conversorMoedaDolar implements IConversorMoeda {
      @Override
    public void converterParaReal(double valor) {
        System.out.println("Conversão Dolar :  " + valor * 5.47);
    }

    @Override
    public void converterParaDolar(double valor) {
        System.out.println("Conversão Real  :" + valor / 5.47);
    }
    
    
}
