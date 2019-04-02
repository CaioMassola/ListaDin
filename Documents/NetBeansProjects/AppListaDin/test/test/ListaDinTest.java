/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

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
    
}
