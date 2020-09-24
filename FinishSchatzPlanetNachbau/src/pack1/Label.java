package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel {

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		if (Var.imSpiel) {

			g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
			g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);

			for (int i = 0; i <= 4; i++) {
				g.drawImage(Var.ischrott1, Var.schrottx1[i], Var.schrotty1[i], 48, 38, null);
			}
			for (int i = 0; i <= 1; i++) {
				g.drawImage(Var.ischrott2, Var.schrottx2[i], Var.schrotty2[i], 48, 38, null);
			}
			g.drawImage(Var.ischrott3, Var.schrottx3, Var.schrotty3, 48, 38, null);

			for (int i = 0; i <= 4; i++) {
				g.drawImage(Var.igegner1, Var.gegnerx[i], Var.gegnery[i], 80, 60, null);
			}

			if (Var.schusskollision == true) {

				g.drawImage(Var.gifgegner, Var.posgegnerx, Var.posgegnery, 104, 95, null);

			}

			if (Var.flammeanimation == 0) {
				g.drawImage(Var.iflamme1, Var.x, Var.y + 58, 50, 50, null);
			} else if (Var.flammeanimation == 1) {
				g.drawImage(Var.iflamme2, Var.x, Var.y + 58, 50, 50, null);
			}

			if (Var.schildanzahl > 0 && Var.schildanzahl <= Var.ischild.length) {
				g.drawImage(Var.ischild[Var.schildanzahl - 1], Var.x - 10, Var.y - 10, 70, 90, null);
			} else if (Var.schildanzahl > Var.ischild.length) {

				g.drawImage(Var.ischild[Var.schildarraymax], Var.x - 10, Var.y - 10, 70, 90, null);

			}

			if (Var.bolschuss == true) {
				g.drawImage(Var.gifschuss, Var.schussx, Var.schussy, 20, 40, null);
			}

			if (Var.moveleft) {
				g.drawImage(Var.iraketelinks, Var.x, Var.y, 50, 70, null);
			} else if (Var.moveright) {
				g.drawImage(Var.iraketerechts, Var.x, Var.y, 50, 70, null);
			} else {
				g.drawImage(Var.irakete, Var.x, Var.y, 50, 70, null);
			}

			g.setColor(new Color(0, 230, 115));
			g.setFont(new Font("Arial", Font.BOLD, 35));
			g.drawString("Schrott: " + Var.schrott, 20, 50);

			g.drawImage(Var.ileben, 600, 500, 50, 50, null);
			g.setFont(new Font("Arial", Font.BOLD, 55));
			g.drawString("" + Var.leben, 670, 545);
			g.setFont(new Font("Arial", Font.BOLD, 25));
			g.drawString("/ " + Var.maxleben, 735, 545);

			g.drawImage(Var.iammo, 20, 495, 56, 65, null);
			g.setFont(new Font("Arial", Font.BOLD, 55));
			g.drawString("" + Var.ammo, 90, 545);
			g.setFont(new Font("Arial", Font.BOLD, 25));
			g.drawString("/ " + Var.maxammo, 155, 545);

			repaint();

			if (Var.kollidiert) {

				if (Var.verloren) {
					g.setFont(new Font("Arial", Font.BOLD, 45));
					g.drawString("Schrott verloren", 225, 200);
				//	g.drawImage(Var.gifrakete, Var.x, Var.y, 77, 92, null);
				}

				g.drawImage(Var.gifexplosion, Var.x - 10, Var.y - 10, 71, 100, null);

			}

			repaint();

		} else if (Var.imMen� || Var.imOptionen || Var.imShop) {

			g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
			g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);

			if (Var.flammeanimation == 0) {
				g.drawImage(Var.iflamme1, Var.x, Var.y + 58, 50, 50, null);
			} else if (Var.flammeanimation == 1) {
				g.drawImage(Var.iflamme2, Var.x, Var.y + 58, 50, 50, null);
			}

			if (Var.bolschuss == true) {
				g.drawImage(Var.gifschuss, Var.schussx, Var.schussy, 20, 40, null);
			}

			
				g.drawImage(Var.irakete, Var.x, Var.y, 50, 70, null);
			

			for (int i = 0; i <= 4; i++) {
				g.drawImage(Var.igegner1, Var.gegnerx[i], Var.gegnery[i], 80, 60, null);
			}

			if (Var.schildanzahl > 0 && Var.schildanzahl <= Var.ischild.length) {
				g.drawImage(Var.ischild[Var.schildanzahl - 1], Var.x - 10, Var.y - 10, 70, 90, null);
			} else if (Var.schildanzahl > Var.ischild.length) {

				g.drawImage(Var.ischild[Var.schildarraymax], Var.x - 10, Var.y - 10, 70, 90, null);

			}

			g.setColor(new Color(100, 100, 100, 128));
			g.fillRect(0, 0, Var.screenwidth, Var.screenheight);

			if (Var.verloren) {
				g.setColor(new Color(0, 230, 115));
				g.setFont(new Font("Arial", Font.BOLD, 35));
				g.drawString("Schrott: " + Var.schrott, 310, 180);

				repaint();
			}
			if (Var.imShop) {

				g.setColor(new Color(0, 230, 115));
				g.setFont(new Font("Arial", Font.BOLD, 35));
				g.drawString("Schrott: " + Var.schrott, 310, 180);
				g.drawString("Leben", 75, 340);
				g.drawString("Sch�sse", 75, 415);
				g.drawString("Plasmaschild", 75, 485);

				g.drawString(Var.up1preis + "s", 310, 340);
				g.drawString(Var.up2preis + "s", 310, 415);
				g.drawString(Var.up3preis + "s", 310, 485);

				g.drawString("St. " + Var.up1anzahl, 550, 340);
				g.drawString("St. " + Var.up2anzahl, 550, 415);
				g.drawString("St. " + Var.up3anzahl, 550, 485);

				g.drawString(Var.uplebenpreis + "s", 700, 185);
				g.drawString("Leben +1", 525, 235);

				g.setColor(Color.BLACK);
				g.drawLine(50, 362, 750, 362);
				g.drawLine(50, 438, 750, 438);

				g.drawLine(300, 300, 300, 500);

				repaint();

			}

			if (Var.imOptionen) {

			}

		}

	}

}
