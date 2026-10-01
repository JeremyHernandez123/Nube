/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisUD1.Exercici6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

/**
 *
 * @author Alumne
 */
public class Pare {
    
        public void main() throws IOException{
            String classpath = System.getProperty("java.class.path"); 
            ProcessBuilder pb = new ProcessBuilder("java", "-cp", classpath, "exercicisUD1.Fill.java"); 
            Process p = pb.start(); 
            String frase = IO.readln("Escriu una frase: "); 
            
            BufferedWriter enviarFill= new BufferedWriter(new OutputStreamWriter(p.getOutputStream())); 
                enviarFill.write(frase); 
                enviarFill.flush();    
                
            
            BufferedReader respostaFill = new BufferedReader(new InputStreamReader(p.getInputStream())); 
            String resultat = respostaFill.readLine(); 
            IO.println("El numero de paraules es:  " + resultat);   
            
        }   
        
}
