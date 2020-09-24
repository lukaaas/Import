import java.util.List;

import javafx.scene.text.Font;

public class Main {

	public static void main(String[] args) {		
		
			List<String> fonts = Font.getFontNames();
			for(String font : fonts)
			{
				System.out.println(font);
			}

	
		}}
