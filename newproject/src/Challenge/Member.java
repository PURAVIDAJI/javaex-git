package Challenge;

public class Member {
  private String name;
  private String ID;
  private String pw;
  private int age;
  
  public Member(String name, String ID, String pw, int age){
    this.name = name;
    this.ID = ID;
    this.pw = pw;
    this.age = age;

  }

  public String getName() {
    return name;
  }

  public String getID() {
    return ID;
  }

  public String getPw() {
    return pw;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    if(age>=120 || age<=0) {
      System.out.println("나이가 부적절합니다.");
    } else {this.age = age;}
  }
}
