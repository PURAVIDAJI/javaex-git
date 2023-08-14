package classExample;
//같은 패키지에 있는 다른 클라스의 것 가져와서 쓸 수 있음
public class UseCircle {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.setRadius(20.0);
    System.out.println("c1 = " + c1);

    Circle c2 = new Circle(30.0);
    System.out.println("c2 = " + c2);

    c1 = c2;
    System.out.println("c2 = " + c2);
    System.out.println("c1 = " + c1);

  }
}
