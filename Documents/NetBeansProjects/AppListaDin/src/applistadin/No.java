/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistadin;

/**
 *
 * @author lab801
 */
public class No {
    Aluno aluno;
    No proximo;
    
    public No(Aluno a){
        aluno = a;
        proximo = null;
        
    }
    
    public Aluno getItem() throws CloneNotSupportedException{
        return (Aluno)aluno.clone();
    }
    
    public void setProximo(No no){
        proximo = no;
    }
            
}
