/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetointersistemaestoque;

import static com.mycompany.projetointersistemaestoque.BlusaMoletom.blusasMoletom;
import static com.mycompany.projetointersistemaestoque.CamisaPolo.camisasPolo;
import static com.mycompany.projetointersistemaestoque.Camiseta.camisetas;
import java.util.ArrayList;

//Bruno Felipe Novelli Ivanaskas Rodrigues
//Caio Henrique Santos
//Kayky Candido Teixeira
//Marco José Inácio Junior
//Matheus Orzanqui
public abstract class Produto {
    private String item;
    private String id;
    private String tamanho;
    private String cor;
    private double precoCusto;
    private double precoVenda;
    private int quantidade;
    
    
    public Produto(){}
    

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double preco) {
        this.precoCusto = preco;
    }
    
    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    //método para adicionar um objeto do tipo blusa moletom em seu arraylist
    public boolean add(BlusaMoletom bm){
           if (bm != null){
               blusasMoletom.add(bm);
               return true;
           }else{
               return false;
           }
       }
    
    //método para adicionar um objeto do tipo camisa polo em seu arraylist
    public boolean add(CamisaPolo cp){
        if (cp != null){
            camisasPolo.add(cp);
            return true;
        }else{
            return false;
        }
    }
        
     //método para adicionar um objeto do tipo camiseta em seu arraylist
    public boolean add(Camiseta c){
        if ( c != null){
            camisetas.add(c);
            return true;
        }else{
            return false;
        }
    }
    
    //método para retornar o arraylist blusasMoletom
    public ArrayList<BlusaMoletom> retornarBlusasMoletom(){
        return blusasMoletom;
    }
    
    //método para retornar o arraylist camisasPolo
    public ArrayList<CamisaPolo> retornarCamisasPolo(){
        return camisasPolo;
    }
    
    //método para retornar o arraylist camisetas
    public ArrayList<Camiseta> retornarCamisetas(){
        return camisetas;
    }
}
