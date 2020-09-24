package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Steuerung {
Timer movement;
	public Steuerung() {
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() 
			{
				if(Var.moveup == true)
				{
					if(Var.y>0)
					{
						Var.y -=Var.speedup;
						System.out.println("Moveup");
					}
				}else if(Var.movedown == true)
				{
					if(Var.y<=490)
					{
						Var.y +=Var.speeddown;
					}
				}else if(Var.moveleft == true)
				{
					if(Var.x>0)
					{
						Var.x -=Var.speedleft;
					}
				}
				else if(Var.moveright == true)
				{
					if(Var.x <=730)
					{
						Var.x +=Var.speedright;
					}
				}
			}
			
		}, 0, 10);
	}

}
