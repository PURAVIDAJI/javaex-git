package chapter05;

import ClassEX2.Circle;

public class ArrayClassEx {
  public static void main(String[] args) {
    Circle[] circles = new Circle[5];
    System.out.println(circles);
    for (int i = 0; i < circles.length; i++) {
      if(i<2)
        circles[i] =  new Circle();//객체 생성하기
    }
    for (Circle circle: circles) {
      System.out.println(circle);
    }
  }
}
