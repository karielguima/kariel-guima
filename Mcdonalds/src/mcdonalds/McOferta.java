/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mcdonalds;

/**
 *
 * @author Aluno
 */
public class McOferta {
    String nome;
    Bebida bebida ;
    Double preco, precooferta ;
    Integer codigo ;
    Hamburger hamburger;
    BatataFrita batata;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public BatataFrita getBatata() {
        return batata;
    }

    public void setBatata(BatataFrita batata) {
        this.batata = batata;
    }
    
   
    
    
    
    public String descricaoOferta (){
        
        return nome + "..." + preco + "=" + hamburger + "..." + batata + "..." + bebida ; 
        
    }
    
    public Double  valorEconomia (){
        precooferta = 0.00;
        
        return preco - precooferta ; 
    }
    
}
