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
public class CamisaPolo extends Produto {
    //construtor padrão
    public CamisaPolo(){}
    
    static ArrayList<CamisaPolo> camisasPolo = new ArrayList<>();

    
    
    //método que retorna o vetor que preencherá a tabela
    public Object[] dadosAtualizaTabelaCP(int j){
        String id = this.retornarCamisasPolo().get(j).getId();
        String item = "C.POLO";
        String tamanho = this.retornarCamisasPolo().get(j).getTamanho();
        String cor = this.retornarCamisasPolo().get(j).getCor();
        int quantidade = this.retornarCamisasPolo().get(j).getQuantidade();
        String precoCusto = "R$ " + this.retornarCamisasPolo().get(j).getPrecoCusto();
        String precoVenda = "R$ " + this.retornarCamisasPolo().get(j).getPrecoVenda();

        Object[] novaCamisaPolo = new Object[]{
            id,
            item,
            tamanho,
            cor,
            quantidade,
            precoCusto,
            precoVenda
        };
        return novaCamisaPolo;
    }
}
