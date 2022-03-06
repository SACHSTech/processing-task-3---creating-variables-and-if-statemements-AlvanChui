import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(random(255), random(255), random(255));
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    int x = (int)random(600);
  int y = (int)random(600);
  int colorR;
  int colorG;
  int colorB;
  if (x <= width / 3 && y <= height  / 3)
  {
    colorR = 127;
    colorG = 255;
    colorB = 255;
  }
  else if (x >= width / 3 && y <= height / 3)
  {
    colorR = 255;
    colorG = 255;
    colorB = 127;
  }
  else if (x <= width / 3 && y >= height / 3)
  {
    colorR = 255;
    colorG = 127;
    colorB = 255;
  }
  else
  {
    colorR = 255;
    colorG = 255;
    colorB = 255;
  }
  fill(colorR, colorG, colorB);
  ellipse(x, y, width / 4, height / 4);
  fill(colorR, colorG, colorB);
  ellipse(x, y + height / 3, width * 5 / 12, height * 5 / 12);
  fill(0,0,0);
  rect(x - width / 150, y + height * 7 / 30, width / 75, height / 60);
  fill(0,0,0);
  rect(x - width / 150,y + height * 17 / 60, width / 75, height / 60);
  fill(0,0,0);
  rect(x - width / 150, y + height / 3, width / 75, height / 60);
  fill(150,150,150);
  ellipse(x - width / 20, y - height / 40, width / 40, height / 40);
  fill(150,150,150);
  ellipse(x + width / 20, y - height / 40, width / 40, height / 40);
  fill(255 - colorR, 255 - colorG, 255 - colorB);
  triangle(x - width/6, y - height / 12, x + width / 6, y- height / 12, x, y - height * 11 / 60);
  }
}
