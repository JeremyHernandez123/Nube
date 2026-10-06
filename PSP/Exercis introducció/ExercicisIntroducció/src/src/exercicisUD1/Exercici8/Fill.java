/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisUD1.Exercici8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Fill {
    public void main() throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String linia;

        while ((linia = in.readLine()) != null) {   
            String[] parts = linia.split(" ");       
            int numero1 = Integer.parseInt(parts[0]);
            String operador = parts[1];
            int numero2 = Integer.parseInt(parts[2]);
            int resultat = 0; 
            
            if(operador == "+"){
                resultat = numero1 + numero2; 
            } else {
                resultat = numero1 * numero2; 
            }

            IO.println(resultat);
        }
        
    }
    
}
