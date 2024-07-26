/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exceptionfuncionario;

import Classes.ExceptionsSalario;
import Classes.Funcionario;

/**
 *
 * @author Windows
 */
public class ExceptionFuncionario {

    public static void main(String[] args) {
       try {
            Funcionario func1 = new Funcionario("Eduardo",001, 3000.00);
            System.out.println("Funcionário criado com sucesso: " + func1.getNome());

            Funcionario func2 = new Funcionario("Maria",002, -1);
            System.out.println("Funcionário criado com sucesso: " + func2.getNome());
        } catch (ExceptionsSalario e) {
            System.err.println("Erro ao criar funcionário: " + e.getMessage());
        }
    }
}
