import org.code.neighborhood.*;

public class PainterPlus extends Painter {
public void turnRight(){
turnLeft();
turnLeft();
turnLeft();
}
  public void takeAllPaint(){
 while(isOnBucket()){
   takePaint();
 }
  }
    
    
    public void moveFast(){
      while(canMove()){
        move();
      }
    }
public void paintToEmpty(String color){
while ( hasPaint()){
  paint(color);
  move();
}
}
public void paintDonut(String color){
  paint(color);
  turnRight();
  move();
  paint(color);
  move();
  paint(color);
  turnRight();
  
}
public void turnAround(){
  turnRight();
  if(isFacingSouth()){
    move();
    turnRight();
  }else{
    turnRight();
    turnRight();
    move();
    turnLeft();
  }
  
}
}
