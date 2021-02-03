package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing2 extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
	}
	
	public void draw()
	{	
		background(255, 0, 0);
		stroke(255);

		noStroke();
		fill(255, 255, 0);
		ellipse(250, 300, 400, 400);
		fill(0, 255, 255);
		triangle(250, 50, 50, 450, 450, 450);
		fill(180, 200, 200);
		ellipse(250, 250, 190, 100);
		fill(0);
		ellipse(250, 250, 70, 70);
	}
}
