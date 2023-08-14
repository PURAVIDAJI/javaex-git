package Challenge;

public class MemberTest {
  public static void main(String[] args) {
    Member member = new Member("김인지","ijk9501","2023eeuu",29);
    //변수를 가져올 때는 getter쓰지 않음.
    member.setAge(16);
    member.setName("김퓌똥");
    System.out.println(member.getName()+"님의 나이는"+ member.getAge()+"입니다.");
    System.out.println(member.getName()+"님의 아이디는 "+ member.getID()+"입니다.");
  }
}
