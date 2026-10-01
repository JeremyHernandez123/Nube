package cat.spaad.tipusStreams;

import java.io.*;
import java.lang.invoke.StringConcatFactory;

public class MetodesCharacterStreams {

    public static void  llegeixCharacters(String origen) throws IOException{

        try (FileReader in = new FileReader(origen)) {
            while (in.ready()) {
                char c = (char) in.read();
                System.out.print(c);
            }
        }
    }

    public static void escriuCharacters(String desti, String dades) throws IOException{
        try (FileWriter out = new FileWriter(desti)){
            for (int i = 0; i < dades.length()-1; i++){
                out.write(dades.charAt(i));
            }
        }
    }
}
