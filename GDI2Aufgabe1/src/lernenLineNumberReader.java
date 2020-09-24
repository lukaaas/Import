import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;


public class lernenLineNumberReader {
	
	public static void main(String[]args) throws IOException
	{
		FileReader fr;
		LineNumberReader lnr;
		FileWriter fw;
		
		try 
		{			
			Scanner x = new Scanner(System.in);
			String eingabe;	
			String ausgabe;
			
			
			System.out.println("Geben Sie eine Datei ein:");
			eingabe = x.nextLine();
			System.out.println("Geben Sie die Datei für die Ausgabe ein:");
			ausgabe = x.nextLine();
			
			if(eingabe=="")
			{
				
			
			
			fr = new FileReader(eingabe);
			lnr = new LineNumberReader(fr);
			fw = new FileWriter(ausgabe);
			String line;
			
			while((line = lnr.readLine()) != null)
			{
				int number = lnr.getLineNumber();
				fw.write(number + " " +line );
				fw.write("\n");
				
			}
			fw.close();
			
			
			}
			else
			{

				fr = new FileReader("testinput.txt");
				lnr = new LineNumberReader(fr);
				fw = new FileWriter("testoutput.txt");
				String line;
				
				while((line = lnr.readLine()) != null)
				{
					int number = lnr.getLineNumber();
					
					fw.write(number + " " +line );
					fw.write("\n");
					
				}
				fw.close();
				
			}
		}
		
		catch (FileNotFoundException e) 
		{			
			e.printStackTrace();
		}
		
	}
}
