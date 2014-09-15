/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revisão;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Revisão {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Professor p = new Professor();
          
  String nome , endereço ,  escola ;
  Double salario;
  boolean tecnico ,superior ;
  nome = JOptionPane.showInputDialog(" Digite o nome do professor :");
  p.setNome(nome);
  
  endereço = JOptionPane.showInputDialog (" Digite o endereço do professor :");
  p.getEndereço();
  
  salario = Double.parseDouble("Digite o salario do professor  :");
  p.getSalario();
  
  escola = JOptionPane.showInputDialog("Digite a escola do professor");
  p.getEscola();
  
  tecnico = JOptionPane.showInputDialog("O professor da aula para o tecnico (Sim/Não) :");
  
  
  
  
    
    }
    
}
