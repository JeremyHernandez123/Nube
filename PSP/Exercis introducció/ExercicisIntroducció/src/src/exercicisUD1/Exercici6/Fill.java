/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisUD1.Exercici6;

import java.io.BufferedReader;
import java.io.BufferedWriter; 
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 

/**
 *
 * @author Alumne
 */
public class Fill  {
    public void main() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     
        String frase = br.readLine(); 
        int nparaules = frase.split("\\s+").length;
        IO.println("El numero de paraules es: " + nparaules); 
    }
}

