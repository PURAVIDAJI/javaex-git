package ClassEX2;

public class CircleEx {
  public static void main(String[] args) {
    Circle c1  = new Circle();
    Circle c2  = new Circle(10);
    Circle c3  = new Circle("RED");
    Circle c4  = new Circle(5,"BLUE");

    System.out.println("c1.color= " + c1.color);
    System.out.println("c4.radius= " + c4.color);


  }
}
