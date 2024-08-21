/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciador;

import Classes.Pessoa;

/**
 *
 * @author Windows
 */
interface gerenciadorPessoa {
    public Pessoa buscar(String cpf);
    public void add(Pessoa newPessoa);
    public void atualizar(String cpf, Pessoa newPessoa);
    public void remover(String cpf);
}

