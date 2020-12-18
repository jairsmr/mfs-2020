import java.io.FileNotFoundException;
import java.io.FileReader;import java.util.Scanner;

public class Exemplo02 {

    public static void main(String args[]) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("/home/wolmir/comandos.sql")).useDelimiter("\\n");
        while (scanner.hasNext()) {
            System.out.println( scanner.next() );
        }
    }

}