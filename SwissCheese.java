//  Michelle Loven  9.12.16
//  Make some swiss cheese!


package practice_test;

import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet;

public class SwissCheese extends Applet{
	public void paint(Graphics g){
	
		Color cheeseColor = new Color(255,255,0);
		Color holeColor = new Color(255,255,255);
		Color backgroundColor = new Color(255,255,255);
		
		g.setColor(backgroundColor);
		g.fillRect(0,0,1000,600);
		
		g.setColor(cheeseColor);
		g.fillRect(200, 200, 200, 200);
		
		g.setColor(holeColor);
		g.fillOval(200,250,40,40);
		g.fillOval(280,200,60,60);
		g.fillOval(270,300,70,70);
		g.fillOval(200,320,60,60);
		g.fillOval(340,340,70,70);
		g.fillOval(340,250,70,70);
		
	}

}
