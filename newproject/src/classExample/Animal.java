package classExample;

class Animal { //여기는 왜 public 안쓰는 가? -> default값으로 써서 필드 접근 제한자를 알려주기 위해서!


  private String name ="Animal";
  void breath(){
    System.out.println("숨쉰다");

  }
  void eat(){
    System.out.println("먹는다");
  }
  void move(){
    System.out.println("움직인다");
  }

  @Override
  public String toString() {
    return "제 이름은" + name +"입니다.";
  }
}
class Bird extends Animal{
  private String name ="Bird";  //부모의 이름이 나오고 있음.
  @Override
  void move() {
    System.out.println("멀리 날아간다");
  }

  @Override
  public String toString() {
    return "제 이름은" +name+"입니다.";
  }
  //  void swim(){
//    System.out.println("헤엄친다");

  }



class Tiger extends Animal {
  private String name ="Tiger";
  @Override
  void move() {
    super.move();
    System.out.println("빠르게 달린다");
  }
  @Override
  public String toString() {
    return "제 이름은" +name+"입니다.";
  }

//  void run() {
//    System.out.println("달린다");

  }

  class Fish extends Animal{
    private String name ="Fish";
    @Override
    void move() {
      System.out.println("헤엄친다");
    }
    @Override
    public String toString() {
      return "제 이름은" +name+"입니다.";
    }
  }
