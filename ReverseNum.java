import java.util.*;
class ReverseNum {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int num=sc.nextInt();
    int reverse = 0;
    while (num > 0) {//1234,123,12,1
      int rem = num % 10;//1234%10=4,3,2,1
      reverse = reverse * 10 +rem;//0*10+4=4,4*10+3=43,43*10+2=432,4320+1=4321
      num = num / 10;//1234/10=123,12,1,0
    }
    System.out.println("The reverse of the given number is: " + reverse);
  }
}
/*1234
  4
  3
  2
  1
  rem=n%10=4
  reverse =rev*10+rem */
  