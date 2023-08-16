package chapter05;

import classExample.Car;

public class String2CompareEx {
  public static void main(String[] args) {
    String s1 ="HI, JAVA";
    String s2 ="Hi, java";

    //compare가 없는 객체?
    Car c1 = new Car();
    Car c2 = new Car();

    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareToIgnoreCase(s2));

    //
    System.out.println(c1==c2); // 주소비교 >False
    System.out.println(c1.equals(c2)); //False : object이 가진 method 두개를 오버라이드해줘야 같아짐.
    //hashCode와 equals를 오버라이드 해서 사용해야만 equals를 사용할 수 있음!
    //System.out.println(c1.com); // compareto는 String에서만 쓸 수 있는것



  }
}
