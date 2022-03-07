import processing.core.PApplet;

public class Sketch extends PApplet {

  public void settings() {
    size(500, 500);
  }

  public void setup() {
    background(random(255), random(255), random(255));
    textSize(32);
    text(hour(), width / 2 - 64, height / 10);
    textSize(32);
    text(":", width/2, height / 10);
    textSize(32);
    text(minute(), width/2 + 32, height / 10);
  }
 
  float x = random(width);
  float y = random(height);

  
  public void draw() {
    int colorR;
    int colorG;
    int colorB;
    if (x < width / 2 && y < height  / 3) {
      colorR = 127;
      colorG = 255;
      colorB = 255;
    }
    else if (x >= width /2 && y < height / 3) {
      colorR = 255;
      colorG = 255;
      colorB = 127;
    }
    else if (x < width / 2 && y >= height / 3) {
      colorR = 255;
     colorG = 127;
     colorB = 255;
    }
    else {
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
    fill((255 - colorR) * 3/2, (255 - colorG) * 3/2, (255 - colorB) * 3/2);
    ellipse(x - width / 20, y - height / 40, width / 40, height / 40);
    fill((255 - colorR) * 3/2, (255 - colorG) * 3/2, (255 - colorB) * 3/2);
    ellipse(x + width / 20, y - height / 40, width / 40, height / 40);
    fill((255 - colorR) * 2, (255 - colorG) * 2, (255 - colorB) * 2);
    triangle(x - width/6, y - height / 12, x + width / 6, y- height / 12, x, y - height * 11 / 60);
  }
}
