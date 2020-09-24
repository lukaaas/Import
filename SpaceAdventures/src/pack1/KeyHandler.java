package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_UP)
		{
			Var.moveup = true;
		System.out.println("UP");
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
		{
			Var.movedown = true;
			System.out.println("DOWN");
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			Var.moveleft = true;
			System.out.println("LEFT");
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			Var.moveright = true;
			System.out.println("RIGHT");
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_UP)
		{
			Var.moveup = false;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
		{
			Var.movedown = false;
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			Var.moveleft = false;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			Var.moveright = false;
		}
		
	}

	
}
