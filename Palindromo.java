/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.palindromo;

import javax.swing.JOptionPane;

/**
 *
 * @author Aprendiz
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra;
        int i=0;
        boolean rta=false;
        palabra=JOptionPane.showInputDialog(null, "ingrese la palabra");
        int tam=palabra.length();
        tam=tam-1;
        while(i<tam && !rta ){
            char[] apalabra=palabra.toCharArray();
            if(apalabra[i]==apalabra[tam]){
                i++;
                tam--;        
            }else{
                rta=true;
            }
        }
        if (rta==false){
            JOptionPane.showMessageDialog(null, "es palindromo");
        }else{
            JOptionPane.showMessageDialog(null, "no es palindromo");
        }
            
    }
    
}
