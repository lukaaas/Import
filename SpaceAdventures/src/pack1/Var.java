package pack1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Var {

	static JFrame jf1;
	static int screenwidth = 800, screenheight = 600;
	static int backgroundY1 = 0,backgroundY2 = -600, backgroundspeed = 9;
	static int x = 400, y = 400;
	static int speedup = 3, speeddown = 2, speedleft = 2, speedright = 2;
	static int flamme=1,flammeanimation;
	static boolean moveup = false,movedown = false,moveleft = false,moveright = false;
	static Label lbl1;
	
	static BufferedImage ib1,ib2;
	static BufferedImage iRakete,iFlamme1,iFlamme2;
	
	
	public Var() {
		
		try {
			//Background einbinden Versuch
			
			ib1 = ImageIO.read(new File("rsc/zwischenergebnis2.png"));
			ib2 = ImageIO.read(new File("rsc/zwischenergebnis2.png"));
			//Rakete festlegen
			iRakete = ImageIO.read(new File("rsc/test.png"));
			//Flammen einfügen
			iFlamme1 = ImageIO.read(new File("rsc/flamme1.jpg"));
			iFlamme1 = ImageIO.read(new File("rsc/flamme2.jpg"));
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden.");
		}
	}

}
