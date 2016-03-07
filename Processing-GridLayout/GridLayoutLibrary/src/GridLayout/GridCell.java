package GridLayout;
import processing.core.*;
public class GridCell
{
  PVector topLeft;
  PVector bottomRight;
  PVector world;

  float width;
  float height;
  PApplet app;
  GridCell(float x, float y, float w, float h, PVector worldTranslate)
  {
	  app=GridLayout.GetApp();
    topLeft=new PVector(x,y);
    bottomRight=new PVector(x+w,y+h);
    world=worldTranslate;

    this.width=w;
    this.height=h;
  }
  
  public void translateTo()
  {
    app.translate(world.x,world.y);
    app.translate(topLeft.x,topLeft.y);
  }
  public void translateTo(float scaleX, float scaleY)
  {
	  app.translate(world.x*scaleX,world.y*scaleY);
	  app.translate(topLeft.x*scaleX,topLeft.y*scaleY);
  }
  
  public void draw()
  {
	  app.pushMatrix();
    translateTo();
    //shape(shapes);
    app.popMatrix();
  }
}
