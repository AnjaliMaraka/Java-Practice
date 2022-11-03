/*An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits

153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153
125: 1^3 + 2^3 + 5^3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
1634: 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1643*/
import java.util.*;
  class Amstrong{
    public static void main(String args[]){ 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    int count=0,rem;
    int sum=0;
    int temp=n;
    while(temp>0){
      temp=temp/10;
      count++;
    }
    temp=n;
    while(temp>0){
    rem=temp%10;
    sum=sum+(int)(Math.pow(rem,count));
    temp=temp/10;
    }
    if(n==sum){
      System.out.println("Amstrong number");
    }
    else{
      System.out.println("Not Amstrong number");
    }
  }
}







