[code]import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class LineReader {

public static void main(String[] args) throws Exception {
	LineNumberReader lineCounter = new LineNumberReader(new InputStreamReader(new FileInputStream("C:\MyFile.txt")));
	String nextLine = null;

	try {
		while ((nextLine = lineCounter.readLine()) != null) {
			if (nextLine == null)
				break;
			System.out.println(nextLine);
		}
		System.out.println("Total number of line in this file " + lineCounter.getLineNumber());
	} catch (Exception done) {
		done.printStackTrace();
	}
}