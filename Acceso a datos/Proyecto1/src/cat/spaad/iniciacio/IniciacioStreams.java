package cat.spaad.iniciacio;

import cat.spaad.tipusStreams.MetodesByteStreams;
import cat.spaad.tipusStreams.MetodesCharacterStreams;

import java.io.IOException;

public class IniciacioStreams {
    public static void provesByte(){
        try {
            // MetodesByteStreams.llegeixBytes("Himne dels pirates ISO-8859-15.txt");

            byte[] arr = {72,111,108,97,32,114,97,100,105,111,108,97,33,33,33};
            MetodesByteStreams.escriuBytes("textoCorto.txt", "Hola manel marc".getBytes());
        } catch (IOException e){
            System.out.print(e.getMessage());
        }

    }

    public static void provesCharacter(){
        try {
            MetodesCharacterStreams.llegeixCharacters("textoLargo.txt");
            MetodesCharacterStreams.escriuCharacters("textoCorto.txt", "Hola manelet");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void provesBuffered(){

    }

    static void main(){
        // provesByte();
        // provesCharacter();
        provesBuffered();
    }
}
