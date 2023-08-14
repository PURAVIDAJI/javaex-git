package classExample;

//public class Lamp {
//  //필드가 두개 있음 on, off
//  boolean status = false;
//
//  //매서드
//  public void turnOn(){
//    status=true;
//  }
//  public void turnOff{
//    status=false;
//  }

  class Car{
    int Speed =0;
    boolean direction = true;

    public void setSpeed(int speed){
      this.Speed = speed;
    }
    public void setDirection(String gear){
      if (gear.equals("전진")){
        this.direction = true;
      }else if (gear.equals("후진")){
        this.direction = false;
      }
    }
  }
