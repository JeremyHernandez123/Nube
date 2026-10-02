package cat.spaad.tipusStreams;

import java.io.*;

public class MetodesBufferedStreams {

    public static String[] llegeixLinia(String origen) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(origen))){
            int i = 0;
            String linia;

            while((linia = br.readLine()) != null){
                i++;
            }

            String[] linies = new String[i];
            i = 0;

            try(BufferedReader brn = new BufferedReader(new FileReader(origen))) {
                while((linia = brn.readLine()) != null){
                    linies[i] = linia;
                    System.out.println(linia);
                    i++;
                }

                return linies;
            }
        }
    }


    public static void escriuLinia(String desti, String[] dades) throws IOException{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(desti))) {
            for (int i = 0; i < dades.length; i++){
                bw.write(dades[i]);
                bw.newLine();
            }
        }
    }
}
