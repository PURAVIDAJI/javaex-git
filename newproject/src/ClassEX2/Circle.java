package ClassEX2;

public class Circle {
  double radius;
  String color;

  /*생성자 오버로딩*/
  //생성자란 필드의 값을 초기화 시켜주는 역할을 한다.
  public Circle(){ //기본값
    this(1.0,"WHITE");
  }
  public Circle(double radius){
    this(radius, "WHITE");
  }
  public Circle(String color){
    this(1.0,color);
  }
  public Circle(double radius, String color){
    this.radius = radius;
    this.color = color;
  }
}
