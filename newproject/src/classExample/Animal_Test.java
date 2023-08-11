package classExample;

public class Animal_Test {
  public static void main(String[] args) {
    Object obj =new Object();//생성자임

    Bird bird = new Bird();
    bird.breath();
    Tiger tiger = new Tiger();
    tiger.run();
    tiger.eat();
    Animal animal = new Animal();
    animal.move();
  }
}
