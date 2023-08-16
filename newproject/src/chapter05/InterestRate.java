package chapter05;

public class InterestRate {
  public static void main(String[] args) {
  double[][] interests ={{3.2,3.1,3.2,3.0},{2.9,2.9,2.7,2.6},{2.7,2.6,2.5,2.7}};
  double[] sum1 ={0.0, 0.0,0.0};
  double sum2 =0.0;

  int i=0;
    for (double[] interest: interests){
      int j=0;
      for (double interestEach:interest){
        sum1[j++] +=interestEach;
      }
      System.out.println(sum1);
      sum2 +=sum1[i++];
    }
    System.out.println(sum2);



  }

}
