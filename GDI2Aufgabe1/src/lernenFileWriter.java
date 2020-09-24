import java.io.FileWriter;
import java.io.IOException;

public class lernenFileWriter {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("testoutput.txt");
			fw.write("Hallo, das ist Zeile 1\n");
			fw.write("und das hier Zeile 2\n");
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Dateifehler... sorry!");
			//e.printStackTrace();
		}
	}

}
