/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author Windows
 */
public class Carro extends Veiculo {
     @Override
    public void acelerar() {
        System.out.println("vruuuuuuuuuuuuuuuum ");
    }
    @Override
    public double calcula_valor(){
        double valor_v = 30000;
        return valor_v;
    }
    
}
