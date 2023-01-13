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
public class BlusaMoletom extends Produto {
    //construtor padrão
    public BlusaMoletom(){}
    
    static ArrayList<BlusaMoletom> blusasMoletom = new ArrayList<>();

    
    
    //método que retorna o vetor que preencherá a tabela
    public Object[] dadosAtualizaTabelaBL(int j){
        String id = this.retornarBlusasMoletom().get(j).getId();
        String item = "BL.MOLETOM";
        String tamanho = this.retornarBlusasMoletom().get(j).getTamanho();
        String cor = this.retornarBlusasMoletom().get(j).getCor();
        int quantidade = this.retornarBlusasMoletom().get(j).getQuantidade();
        String precoCusto = "R$ " + this.retornarBlusasMoletom().get(j).getPrecoCusto();
        String precoVenda = "R$ " + this.retornarBlusasMoletom().get(j).getPrecoVenda();

        Object[] novaBlusaMoletom = new Object[]{
            id,
            item,
            tamanho,
            cor,
            quantidade,
            precoCusto,
            precoVenda
        };
        return novaBlusaMoletom;
    }
}
