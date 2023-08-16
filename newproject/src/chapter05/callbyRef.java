package chapter05;

import classExample.Circle;

public class callbyRef {
  public static void main(String[] args) {
    Circle c1 = new Circle(10);
    Circle c2 = new Circle(10);

    zero(c1);
    System.out.println("메서드 실행후 반지름 c1 :" + c1.getRadius());
    zero(c2.getRadius());
    System.out.println("메서드 실행후 반지름 c2 :" + c2.getRadius());
  }
  public static void zero(Circle c){//read &write 모두 가능
    c.setRadius(1.0);
  }
  public static void zero(double r){
    r=0.0; //지역변수만 바뀌고 실제 반지름은 바뀌지 않음!


  }
}
