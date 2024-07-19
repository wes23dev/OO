/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author 15102938681
 */
public class Diretor extends Funcionario{
     private String areaDeResponsabilidade;
    private double bonusAnual;

    public Diretor() {
        super();
        this.areaDeResponsabilidade = "";
        this.bonusAnual = 0.0;
    }

    public Diretor(String nome, int id, double salario, String areaDeResponsabilidade) {
        super(nome, id, salario);
        this.areaDeResponsabilidade = areaDeResponsabilidade;
    }

    @Override
    public void Preencher() {
        Scanner ler = new Scanner(System.in);
        super.Preencher();
        System.out.print("area de Responsabilidade: ");
        this.areaDeResponsabilidade = ler.nextLine();
    }

    public void calcularBonusAnual() {
        this.bonusAnual = this.salario * 0.20; // Bônus de 20%
    }

    @Override
    public void Imprimir() {
        calcularBonusAnual();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea de Responsabilidade: " + this.areaDeResponsabilidade + "\nBosnus Anual: R$ " + this.bonusAnual;
    }


    public String getAreaDeResponsabilidade() {
        return areaDeResponsabilidade;
    }

    public void setAreaDeResponsabilidade(String areaDeResponsabilidade) {
        this.areaDeResponsabilidade = areaDeResponsabilidade;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
    
}
