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
public class ServicoFinanceiro {
    private IConversorMoeda converte;

    public ServicoFinanceiro(IConversorMoeda converte) {
        this.converte= converte;
    }
    
    
            
    public void realizarTransacao(double valor){
        converte.converterParaReal(valor);
        converte.converterParaDolar(valor);
    }
}
