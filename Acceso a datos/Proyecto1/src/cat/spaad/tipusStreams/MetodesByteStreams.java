package cat.spaad.tipusStreams;

import cat.spaad.iniciacio.IniciacioStreams;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;


public class MetodesByteStreams {

    public static void llegeixBytes(String origen) throws IOException {
        try (FileInputStream in = new FileInputStream(origen)) {
            int c;
            while ((c = in.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escriuBytes(String desti, byte[] dades) throws IOException {
        try (FileOutputStream out = new FileOutputStream(desti)) {
            for (byte b : dades) {
                out.write(b);
            }
        }
    }

}