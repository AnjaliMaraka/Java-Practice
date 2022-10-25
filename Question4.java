/*Wisconsin State Fair is one of the largest midsummer celebrations in the Midwest Allis, showcasing the agriculture skills and prowess of the state. The Event organizers hired few part-time employees to work at the fair and the agreed salary paid to them are as given below:
Weekdays --- 80 / hour
Weekends --- 50 / hour
Justin is a part-time employee working at the fair. Number of hours Justin has worked in the weekdays is 10 more than the number of hours he had worked during weekends. If the total salary paid to him in this month is known, write a program to estimate the number of hours he had worked during weekdays and the number of hours he had worked during weekends.
Input Format:
First line of the input is a double value that corresponds to the total salary paid to Justin.
Output Format:
First line of the output should display the number of hours Justin has worked during the weekdays.
Second line of the output should display the number of hours Justin has worked during the weekends.
Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and rest corresponds to output.]
Sample Input and Output:
Enter the total salary paid
2750
Number of weekday hours is 25
Number of weekend hours is 15*/
import java.util.Scanner;
class Question4{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the total salary");
    int a=s.nextInt();
    int x=(a-800)/130;
    System.out.println("Weekend Hours is "+ x);
    System.out.println("Weekdays hours is "+(10+x));
  }
}