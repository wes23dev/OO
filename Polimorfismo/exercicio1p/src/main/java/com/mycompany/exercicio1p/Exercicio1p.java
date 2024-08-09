/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1p;

import Interfaces.Atacante;
import classes.guerreiro;
import classes.mago;

/**
 *
 * @author Windows
 */
public class Exercicio1p {

   
       public static void main(String[] args) {
        Atacante ReiArthur = new guerreiro();
        Atacante dan = new mago();
        
        atacarInimigo(ReiArthur, dan);
    }
    
    static void atacarInimigo(Atacante a, Atacante b){
        a.atacar();
        b.atacar();
    }
}
