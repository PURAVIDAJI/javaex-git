package classExample;
//캡슐화
public class CircleEx {
  public static void main(String[] args) {
    
    Circle circle = new Circle();
    circle.setRadius(10);
    System.out.println("circle.getRadius = " + circle.getRadius());
    System.out.println("circle.findArea = " + circle.findArea());;
  }
}
