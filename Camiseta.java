/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetointersistemaestoque;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Camiseta extends Produto {
    //construtor padrão
    public Camiseta(){}
    
    static ArrayList<Camiseta> camisetas = new ArrayList<>();

    
    
    //método que retorna o vetor que preencherá a tabela
    public Object[] dadosAtualizaTabelaC(int j){
        String id = this.retornarCamisetas().get(j).getId();
        String item = "CAMISETA";
        String tamanho = this.retornarCamisetas().get(j).getTamanho();
        String cor = this.retornarCamisetas().get(j).getCor();
        int quantidade = this.retornarCamisetas().get(j).getQuantidade();
        String precoCusto = "R$ " + this.retornarCamisetas().get(j).getPrecoCusto();
        String precoVenda = "R$ " + this.retornarCamisetas().get(j).getPrecoVenda();

        Object[] novaCamiseta = new Object[]{
            id,
            item,
            tamanho,
            cor,
            quantidade,
            precoCusto,
            precoVenda
        };
        return novaCamiseta;
    }
}
