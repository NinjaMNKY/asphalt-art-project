import org.code.neighborhood.*;

public class goombaPainter extends PainterPlus{
//allows the painter to paint a straight line
  
  public void paintLine(String color, int spaces) {
    setPaint(spaces);

    while (hasPaint()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
  }

// Paints a background

  
  public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
       turnAround();

      if (canMove("south")) {
        paintLine(color, size);
            turnAround();
      }
    }

    paintLine(color, size);

  }
//Painting the goomba head
public void paintGoombaHead(){
  //move to start of the top of the head
  move();
  move();
  move();
  move();
  
turnRight();
  move();
  move();
  turnLeft();
  //start painting the head
  paintLine("SaddleBrown",4);
  turnRight();
  move();
  turnRight();
  paintLine("SaddleBrown",6);
  turnLeft();
  move();
  turnLeft();
  paintLine("SaddleBrown",8);
 turnRight();
  move();
  turnRight();
  paintLine("SaddleBrown",10);
   turnLeft();
  move();
  turnLeft();
  paintLine("SaddleBrown",12);
   turnRight();
 move();
  turnRight();
  paintLine("SaddleBrown",12);
}
//painting goomba body
  public void paintGoombaBody(){
//move to start of body
    turnLeft();
  move();
  turnLeft();
  move();
  move();
  move();
  move();
  move();
//paint the body
paintLine("Tan",2);
  turnRight();
  move();
  turnRight();
    move();
  paintLine("Tan",2);
  }
  public void paintGoombaBoots(){
   /*
   * Paints left Boot
   */
    paintLine("Black",3);
   turnLeft();
  move();
  turnLeft();
  move();
  paintLine("Black",3);
      /*
   * moves to the Right boot
   */
  move();
  move();
  paintLine("Black",3);
   turnLeft();
  move();
  turnLeft();
  move();
  paintLine("Black",3);   
}
  public void paintMouth(){
  //move to mouth
  turnRight();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    turnLeft();
       turnLeft();
    //paint mouth
  paintLine("Black",6);
  }
public void paintEyes(){
//moves to the eye area and paints
turnRight();
  move();
  move();
    turnRight();
  move();
  move();
  setPaint(99);
  //paints left eye
  paint("white");
   //paints Right eye
  move();
  move();
  move();
  paint("white");
}
public void paintEyebrow(){
//get to the eybrows
  setPaint(99);
  move();
  turnLeft();
  move();
  move();
  turnLeft();
  move();
  move();
  //start painting the bottom part of the eyebrow
  paintLine("Black",2);   
  //Left eyebrow
  turnRight();
  move();
  setPaint(99);
  paint("Black");
move();
  turnLeft();
  move();
  paint("Black");
   /*
   * Moves to the start of the right eyebrow and starts painting
   */
    turnRight();
    turnRight();
move();
move();
move();
move();
move();
  paint("Black");
 turnRight();
    turnRight();
move();
    turnLeft();
move();
  paint("Black");

  
}
}