/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicisintroducció;

/**
 *
 * @author Alumne
 */
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomUser = IO.readln("Introdueix el teu nom"); 
        Integer horesTreball = Integer.parseInt(IO.readln("Introdueix les hores treballades")); 
        Integer preuHora = Integer.parseInt(IO.readln("Introdueix el preu hora")); 
        
        Float _ = horesTreball * preuHora; 
        
    }
    
}
