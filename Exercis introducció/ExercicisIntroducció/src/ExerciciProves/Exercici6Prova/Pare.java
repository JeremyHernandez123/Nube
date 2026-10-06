/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciProves.Exercici6Prova;
import exercicisUD1.Exercici6.*;
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
            try {
                ProcessBuilder pb = new ProcessBuilder("ping", "google.com"); 
                Process p = pb.start(); 
            
                BufferedReader enviarFill= new BufferedReader(new InputStreamReader(p.getInputStream())); 
                    String line; 

                    while((line = enviarFill.readLine()) != null){
                        IO.println(line);
                    }
                BufferedReader respostaFill = new BufferedReader(new InputStreamReader(p.getInputStream())); 
                String resultat = respostaFill.readLine();   
                IO.println(resultat);
            } catch (IOException e) {
                IO.println(e);
            }
            
        }   
        
}
