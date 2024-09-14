import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
  /*
   * Creates a new Painter and paints the background blue
   */
    goombaPainter y=new goombaPainter();
    /*
   * paints the background
   */
    y.paintBackground("LightSkyBlue",12);
  y.turnLeft();
  y.turnLeft();
  y.paintLine("green",12);   
    
 /*
   * starts painting the goomba
   */
goombaPainter x= new goombaPainter();
    //painting each part of the goomba
    x.paintGoombaHead();
    x.paintGoombaBody();
    x.paintGoombaBoots();
    x.paintMouth();
 x.paintEyes();
     x.paintEyebrow();
  }
}