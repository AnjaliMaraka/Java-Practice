
/*enter num1
  10
enter num2

20
***********calculator*************
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.exit

select option
1
Addition is 30

2

  Subtraction is -10*/
/*import java.util.*;
class Switch1{
  public static void main(String args[]){
    double result;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter num1");
    int num1=sc.nextInt();
    System.out.println("Enter num2");
    int num2=sc.nextInt();
    System.out.println("select the number 1.Addition 2.Subtraction 3.Multiplication 4.Division 5.exit");
    int num=sc.nextInt();
    switch(num){
      case1:
        int sum=num1+num2;
        System.out.println("num1 + num2= "+sum);
        break;
      case1:
        int sub=num1-num2;
        System.out.println("num1 - num2= "+sub);
        break;
      case1:
        int mul=num1*num2;
        System.out.println("num1 * num2= "+mul);
        break;
      case1:
        int div=num1/num2;
        System.out.println("num1 / num2= "+div);
        break;
      default:
        System.out.println("invalid input try again");
        break;
    }
  }
}*/
import java.util.*;

class Switch1 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the first number");
    int num1 = s.nextInt();
    System.out.println("Enter the second number");
    int num2 = s.nextInt();
    System.out.println("****Calculator****");
    System.out.println("Select the number\n 1 For add\n 2.For sub\n 3.For mul\n 4.For div");
    int cal = s.nextInt();
    switch (cal) {
      case 1:
        int sum = num1 + num2;
        System.out.println("Addition of two number is " + sum);
        break;
      case 2:
        int sub = num1 - num2;
        System.out.println("Subtraction of two number is " + sub);
        break;
      case 3:
        int mul = num1 * num2;
        System.out.println("Multiplication of two number is " + mul);
        break;
      case 4:
        int div = num1 / num2;
        System.out.println("Division of two number is " + div);
        break;
      default:
        System.out.println("Invalid input try again");
    }
  }
}