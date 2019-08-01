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
        palabra=JOptionPane.showInputDialog(null, "ingrese la palabra");
        palabra = palabra.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
                .replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
        String invertida = new StringBuilder(palabra).reverse().toString();
        
        if (invertida.equals(palabra)){
            JOptionPane.showMessageDialog(null, "es palindromo");
        }else{
            JOptionPane.showMessageDialog(null, "no es palindromo");
        }
            
    }
    
}
