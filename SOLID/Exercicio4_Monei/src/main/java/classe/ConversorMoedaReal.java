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
public class ConversorMoedaReal implements IConversorMoeda{

    @Override
    public void converterParaReal(double dolar) {
        System.out.println("Conversão Dolar :  " + dolar * 5.47);
    }

    @Override
    public void converterParaDolar(double real) {
        System.out.println("Conversão Real  :" + real / 5.47);
    }
    
    
}
