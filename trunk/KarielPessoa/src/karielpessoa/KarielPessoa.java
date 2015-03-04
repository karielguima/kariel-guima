/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package karielpessoa;

import javax.swing.JOptionPane;
import karielpessoa.modelo.Pessoa;

/**
 *
 * @author Aluno
 */
public class KarielPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    Pessoa pessoa = new Pessoa();
    
    while(pessoa.getCodigo()==null)
    try
    {
        pessoa.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite Código:")));  
        
    }
    catch(Exception ex)
    {
           JOptionPane.showMessageDialog(null, "É O NÚMERO O CÓDIGO");
    }
      pessoa.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite Código:")));  
      pessoa.setNome(JOptionPane.showInputDialog("Digite nome:"));
      pessoa.setSexo(JOptionPane.showInputDialog("Digite sexo:"));
    
      
      JOptionPane.showMessageDialog(null, pessoa.getCodigo() +"\n" +
                                          pessoa.getNome  () +"\n" +
                                          pessoa.getSexo  () );
      
    }
    
}
