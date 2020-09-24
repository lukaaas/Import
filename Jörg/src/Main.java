
public class Main {
	
	public static void run()
	{
		long zeit;
		long startzeit = System.currentTimeMillis() / 1000;
		
		while(true)
		{
			try
			{
				Thread.sleep(1000);
			} 
			
			catch (InterruptedException e)
			{
			
				e.printStackTrace();
				break;
			}
			
			zeit = System.currentTimeMillis() / 1000 - startzeit;
			System.out.println(zeit);
			
		}
	}
	
	public static void main (String[]args)
	{
		run();
	}
	
	
}
