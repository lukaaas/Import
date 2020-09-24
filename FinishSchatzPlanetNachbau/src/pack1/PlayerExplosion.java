package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class PlayerExplosion {
	Timer expl;
	private int temp = 0;

	public PlayerExplosion() {
		expl = new Timer();
		expl.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.kollidiert == true && Var.verloren == true) {
					if (temp < 10) {

						temp++;

					} else if (temp == 10) {

					//	Var.gifrakete.flush();
						temp = 0;
					}

				}

			}

		}, 0, 8);
	}

}
