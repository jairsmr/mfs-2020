import java.io.*;

public class Exemplo01 {

    public static void main(String args[]) throws IOException {
        FileInputStream stream = new FileInputStream("/home/wolmir/comandos.sql");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        while(linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
    }
}