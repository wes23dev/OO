/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import abstracts.meioPagamento;

/**
 *
 * @author Windows
 */
public class cartaodeDebito extends meioPagamento {
     @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " efetuado com cartão de débito.");
    }
    
}
