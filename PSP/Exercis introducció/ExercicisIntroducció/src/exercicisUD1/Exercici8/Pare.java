/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisUD1.Exercici8;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Random; 

/**
 *
 * @author Alumne
 */
public class Pare {
    public static void main(String[] args) throws IOException{
        String classpath = System.getProperty("java.class.path"); 
        
        ArrayList <String> llistaOperadors = new ArrayList<>(); 
            llistaOperadors.add("+");
            llistaOperadors.add("*");
            
        Random operadorRandom = new Random(); 
        int openAleatori = operadorRandom.nextInt(llistaOperadors.size()); 
        String elementoAleatorio = llistaOperadors.get(openAleatori);

        int nombreAleatori1 = (int) (Math.random() * 10) + 1;
        int nombreAleatori2 = (int) (Math.random() * 10) + 1;
        
        int correccio = resultat(nombreAleatori1,nombreAleatori2, elementoAleatorio); 
        
        ProcessBuilder pb = new ProcessBuilder("java", "-cp", classpath, "exercicisUD1.Exercici8.Fill"); 
        Process p = pb.start(); 
        
        BufferedWriter enviaFill = new BufferedWriter(new OutputStreamWriter(p.getOutputStream())); 
            enviaFill.write(nombreAleatori1 + " " + elementoAleatorio + " " + nombreAleatori2);
            enviaFill.newLine();
            enviaFill.flush();
            
        BufferedReader resposta = new BufferedReader(new InputStreamReader(p.getInputStream()));   
            int respostaInt = Integer.parseInt(resposta.readLine()); 
            if(correccio == respostaInt){
                IO.print("L'operacio es:  " + nombreAleatori1 + " " + elementoAleatorio + " " + nombreAleatori2 + " La resposta es correcta: " + resposta);
            } else {
                IO.print("La resposta " + resposta + " no es correcta,  es: " + correccio);
            }
            
            
    }
    
    public static int resultat(int a, int b, String operador){
        int resultat = 0; 
        if(operador == "+"){
            resultat = a + b; 
        } else if (operador == "*"){
           resultat =  a * b; 
        }    
        return resultat;
    }
           
}
