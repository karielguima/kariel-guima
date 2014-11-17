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
public class Bebida {
    
    String nome ;
    Double preco , unidademedida ;
    Integer codigo , qtd ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getUnidademedida() {
        return unidademedida;
    }

    public void setUnidademedida(Double unidademedida) {
        this.unidademedida = unidademedida;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }
    
    
    
    public String descricaoCardapio () {
    
    return nome + "...." + preco + "_" + unidademedida ;
    
    }
    
    
    
}
