package classExample;

//클래스 자체에도 private을 설정할 수 있음
public class Circle {
  private double radius = 0.0; //클래스 안에서만 사용하는 private 변수 : 필드

  //기본생성자가 만들어짐.
  //상속자 오버로딩
  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    if (radius <= 0) {
      System.out.println("설정할 수 없습니다.");
    } else {
      this.radius = radius;
    }
    //저위의 전역변수와 지역변수 이름이 같음 > 구분해야햠 ! this. >객체 내가 가진 radius는 전역변수 말하는 거임
  }

  public double findArea() {
    return Math.PI * radius * radius;
  }
  // getter > 은닉된 값을 밖으로 보여주는 역할
//  public double getRadius(){
//    return radius;
//  }
//  // setter 값 바꿈
//  public void setRadius(double r){
//    radius = r;
//
//  }

}
