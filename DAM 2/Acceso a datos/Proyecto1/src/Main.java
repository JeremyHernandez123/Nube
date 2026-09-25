import java.nio.file.Path;
import java.nio.file.Files;

import static java.io.File.*;


void main() {

        // 1. Construeix un path a partir d'un String i mostra tota la informació possible d'aquest path per consola.
        Path ruta = Path.of("C:\\Users\\Alumne\\Documents\\DAM 2\\Acceso a datos\\Proyecto1");
        IO.println("ruta absoluta: " + ruta.toAbsolutePath());
        IO.println(ruta);
        IO.println("Ruta pare: " + ruta.getParent());
        IO.println("Nom directori/arxiu: " + ruta.getFileName());
        IO.println("Element posició 1: " + ruta.getName(2));


        // 2. Utilitza la classe Files per mostrar per consola tota la informació sobre un arxiu o directori del vostre sistema.
        Path ruta2 = Path.of("C:\\Users\\Alumne\\Documents\\DAM 2\\PSP");

        IO.println("True si es un fitxer i false si es un directori: " + Files.isRegularFile(ruta2));
        IO.println("True si es un directori: " + Files.isDirectory(ruta2));
        IO.println("" + Files.isWritable(ruta2));
        try {
            IO.println("True si els dos path representen el mateix objecte" + Files.isSameFile(ruta, ruta2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            IO.println("Mida del path en bytes" + Files.size(ruta2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            IO.println("" + Files.isHidden(ruta2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            IO.println("" + Files.getLastModifiedTime(ruta2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            IO.println("" + Files.getOwner(ruta2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 3. Copia un fitxer entre dos directoris



        // 4. Mou un fitxer a un altre directori.
        try {
            Files.move(ruta, ruta2, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 5. Copia un directori sencer (només els arxius).

        try {
            Files.copy(ruta, ruta2, LinkOption.NOFOLLOW_LINKS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 6 Mostra per consola el contingut d'un directori, inclosos els seus subdirectoris i els seus continguts.


        try (DirectoryStream<Path> stream = Files.newDirectoryStream(ruta)) {
            for(Path file:stream){
                IO.println(file.getFileName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
