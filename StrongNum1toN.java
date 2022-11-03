// Strong number

// If the sum of the factorial of digits of a number (N) is equal to the number itself, the number (N) is called a special number.

// Consider a number 145 and check it is a special number or not.
// The digits of the number are: 1, 4, 5

// Factorial of digits:

// !1 = 1

// !4 = 4*3*2*1 = 24

// !5 = 5*4*3*2*1 = 120

// Sum of factorial of digits = 1 + 24 + 120 = 145

// Compare the sum of the factorial of digits with the given number, i.e. 145 = 145. We observe that both are equal.
// Program in Java to check if a given number is a strong number or not
import java.util.*;

import java.util.*;
class StrongNum1toN{
  public static void main(String args[])
  { 
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();//160
    int count,sum=0,temp,rem,fact;
    for(int i=1;i<=n;i++){ //1<=160
     temp=i;
      while(temp>0){
        rem=temp%10;
        fact=1;
        for(int j=1;j<=rem;j++){
          fact=fact*j;
        }
       
        sum=sum+fact;
        temp=temp/10;
      }
      if(sum==i){
        System.out.println(i);
      }
       sum=0;
    }
    
    }
  }