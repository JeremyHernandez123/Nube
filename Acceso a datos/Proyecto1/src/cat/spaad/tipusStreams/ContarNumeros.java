package cat.spaad.tipusStreams;

import java.io.*;

public class ContarNumeros {

    public static void llegirNumeros(String origen) {
        try (DataInputStream dtin = new DataInputStream(new BufferedInputStream(new FileInputStream(origen)))) {

            int numMax = 0;
            try {
                while (true) {
                    numMax += dtin.readInt();
                }
            } catch (EOFException e) {}

            System.out.println(numMax);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
