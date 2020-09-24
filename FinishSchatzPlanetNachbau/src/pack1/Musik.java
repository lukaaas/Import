package pack1;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musik {

public static synchronized void music(String track){
		
		final String trackname = track;
		//Musik -> wird im Thread gelesen und gespielt
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				while(true){
	
					//Abfrage werlcher Track gespielt wird
					
						
						try{
						
						//Track wird als Clip definiert und vom AudioStream ausgelesen
						Clip clip = AudioSystem.getClip();
						AudioInputStream inputstream = AudioSystem.getAudioInputStream(new File(trackname));
						clip.open(inputstream);
						//Track wird gespielt
						clip.start();
						clip.loop(clip.LOOP_CONTINUOUSLY);
						//Die Tracklänge wird ermittelt in Microsekunden -> /1000000 sind 1 Sekunde
						Var.tracklänge = (int) clip.getMicrosecondLength()/1000000;
					
						//Der Thread wird lahmgelegt um ein vielfaches starten des selben Tracks zu verhindern
						Thread.sleep(clip.getMicrosecondLength()/1000);
						
						
					}catch (Exception e){
						e.printStackTrace();
					}
				
				
			}
				
				
			}
			
		}).start();
		
	}

}
