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
public class ListaDin {
    No inicio;
    
    public boolean isEmpty(){
       return inicio == null; 
    }
    
    public Aluno getInicio() throws CloneNotSupportedException{
        return inicio.getItem(); 
    }
    
    public void insereInicio(String nome, int ra){
        //cria o novo no a ser inserido na lista
        Aluno a = new Aluno(nome, ra);
        No novoNo = new No(a);
        
        
        //aponta o proximo do novo no para o inicio da lista 
        novoNo.setProximo(inicio);
        
       
        //aponta o inicio da lista para o novoNo inserido
        inicio = novoNo;
    }
    
    public String show(){
        No aux = inicio;
        String saida = "";
        while(aux != null){
            saida += aux.getAluno().getNome();
            aux = aux.getProximo();
        }
        
    
    return saida;
}
