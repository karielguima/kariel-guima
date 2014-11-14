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
    
    String nome , hamburger , batata , bebida ;
    Double preco ;
    Integer codigo ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHamburger() {
        return hamburger;
    }

    public void setHamburger(String hamburger) {
        this.hamburger = hamburger;
    }

    public String getBatata() {
        return batata;
    }

    public void setBatata(String batata) {
        this.batata = batata;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
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
    
    
    
    public String descricaoOferta (){
        
        return nome + "..." + preco + "=" + hamburger + "..." + batata + "..." + bebida ; 
        
    }
    
    public String valorEconomia (){
        return " Você economizou R$ 8.00 comprando o McOferta !!! "; 
    }
    
}
