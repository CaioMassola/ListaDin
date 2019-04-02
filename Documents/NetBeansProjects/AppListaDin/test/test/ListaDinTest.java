/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import applistadin.Aluno;
import applistadin.ListaDin;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author lab801
 */
public class ListaDinTest {
    
  @Test
  public void testListaVazia(){
      ListaDin l = new ListaDin();
      Assert.assertTrue(l.isEmpty());
  }
  @Test
  
  public void testInserirNoInicio() throws CloneNotSupportedException{
      ListaDin l = new ListaDin();
      l.insereInicio("Marcos", 12345);
     
      l.insereInicio("Joao", 555555);
       Aluno a = l.getInicio();
      Assert.assertEquals("Joao", a.getNome());
      
  }
  
  
    
}
