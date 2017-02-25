/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service1;

/**
 *
 * @author W207777797
 */
public class SeriousComponent {
    /**
  * This function tests the seriousness of a String.
  * Returns false if the string contains the word
  * "FUNNY", returns true otherwise.
     * @param text
     * @return 
  */
  public static boolean testSeriousness( String text ) {
    return !text.toUpperCase().contains( "FUNNY" );
  }
    
}
