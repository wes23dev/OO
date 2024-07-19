/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcionarioheranca;

import classes.Diretor;
import classes.Engenheiro;
import classes.Funcionario;
import classes.Gerente;
import classes.Secretario;

/**
 *
 * @author 15102938681
 */
public class FuncionarioHeranca {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Engenheiro e1 = new Engenheiro();
        Diretor d1 = new Diretor();
        Secretario s1 = new Secretario();
        Gerente g1 = new Gerente();

        System.out.println("FUNCIONARIO: ");
        f1.Preencher();
        f1.aumentarSalario();
        f1.Imprimir();

        System.out.println("\nENGENHEIRO: ");
        e1.Preencher();
        e1.aumentarSalario();
        e1.Imprimir();

        System.out.println("\nDIRETOR: ");
        d1.Preencher();
        d1.aumentarSalario();
        d1.calcularBonusAnual();
        d1.Imprimir();

        System.out.println("\nSECRETARIO: ");
        s1.Preencher();
        s1.organizarAgenda();
        s1.Imprimir();

        System.out.println("\nGERENTE: ");
        g1.Preencher();
        g1.aumentarSalario();
        g1.Imprimir();
    }
}
}
