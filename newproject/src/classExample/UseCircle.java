package classExample;
//같은 패키지에 있는 다른 클라스의 것 가져와서 쓸 수 있음
public class UseCircle {
  public static void main(String[] args) {
    Circle c = new Circle();
    c.setRadius(20.0);
    System.out.println("c.getRadius() = " + c.getRadius());

    Circle c2 = new Circle(30.0);
    System.out.println("c2.getRadius() = " + c2.getRadius());
    Circle c3 = new Circle();
    // 생성자 내용있을 때는 안을 꼭 채워주어야 하므로 새로운 깡통 생성자를 하나 만들어서 사용
    c3.setRadius(40.0);
    System.out.println("c3.getRadius() = " + c3.getRadius());

  }
}
