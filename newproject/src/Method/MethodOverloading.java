package Method;

public class MethodOverloading {
  public static void main(String[] args) {
    System.out.println(sum(1,2));
    System.out.println(sum(1,3,5));
    System.out.println(sum(100L,4000L,100000000L));
  }
  static int sum(int i, int j){
    return i+j ;
  }
  //오버로딩 , 변수 개수 다르게
  static int sum(int i, int j,int k){
    return i+j+k ;
  }
  // 매개변수 타입 다르게 오버로딩
  static long sum(long i, long j, long k){
    return i+ j+ k ;
  }
  //
}
