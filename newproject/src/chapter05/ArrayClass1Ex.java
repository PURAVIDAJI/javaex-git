package chapter05;

import classExample.Circle;

public class ArrayClass1Ex {
  //findArea가 있는 circle을 원소로 가지는 배열, 배열의 크기는 5 만드록
  //각 circle의 radius(1,2,3,4,5)s를 다르게 해서 초기화하고
  //5개 원의 넓이를 출력해보라

  public static void main(String[] args) {

    Circle[] circles = new Circle[5];
    for (int i = 0; i < circles.length; i++) {
      circles[i] = new Circle((double)i + 1);
    }
    int i=0;
    for (Circle circle:circles) {
      System.out.printf("원[%d]의 넓이= %.2f\n",i++, circle.findArea());
    }
  }
  //원의 반지름을 1씩 증가시키는 change 함수 생성
  //함수가 실행된 이후에 원의 반지름이 1씩 증가할 수 있도록 참조변수를 매개변수로 하는 매서드 만드시오



  public static void change(Circle c) {
    c.setRadius(c.getRadius()+1);
  }
}