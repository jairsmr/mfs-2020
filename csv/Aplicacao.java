import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class csv {

    public static void main(String args[]) throws IOException {
        Path path = Paths.get("/home/wolmir/comandos.sql");

        List<String> linhasArquivo = Files.readAllLines(path);
        for (String linha : linhasArquivo) {
            System.out.println( linha );
        }
    }
}