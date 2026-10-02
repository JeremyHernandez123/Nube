package cat.spaad.tipusStreams;

import java.io.*;

public class MetodesDataStreams {

    public static void escriuArray(String desti, double[] dades) throws IOException {
        try(DataOutputStream dt = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(desti)))) {
            for(int i = 0; i < dades.length; i++){
                dt.writeInt(dades.length);
                for(double d : dades){
                    dt.writeDouble(d);
                }
            }
        }
    }

    public static  double[] llegeixArray(String desti) throws IOException{
        try(DataInputStream dtin = new DataInputStream(new BufferedInputStream(new FileInputStream(desti)))) {

            int numLines = dtin.readInt();
            double[] dades = new double[numLines];
            for (int i = 0; i < numLines; i++){
                dades[i] = dtin.readDouble();
                System.out.println(dades[i]);
            }
            return dades;
        }
    }
}
