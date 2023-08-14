package classExample;

public class course {
  private String ID;
  private String name;
  private int numOfstudents;

// getter는 다 접근가능
  public String getID() {
    return ID;
  }
  public String getName() {
    return name;
  }
  public int getNumOfstudents() {
    return numOfstudents;
  }

  //Setter는 바꿀 일이 없음 (이름 정도만 바꿀 수 있음)


  public void setName(String name) {
    this.name = name;
  }

  public void addStudent(int student){
    numOfstudents += student;

  }
  public void deleteStudent(int student){
    numOfstudents -= student;
  }
}
