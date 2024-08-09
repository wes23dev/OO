/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import Interfaces.Atacante;

/**
 *
 * @author Windows
 */

public class mago implements Atacante {
         @Override
    public void atacar() {
        System.out.println("Ataque elemental: Fogo Frio!");
    }
}
