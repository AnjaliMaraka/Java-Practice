/*5 subjects marks
  percentage 

  diplay student grade
  per 90 to 100 --A
  per 80 to 90--B
  per 70 to 80--C
  per 60 to 70--D
  fails*/
import java.util.*;
class Grades{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter sub1 marks");
    int sub1=sc.nextInt();
    System.out.println("enter sub2 marks");
    int sub2=sc.nextInt();
    System.out.println("enter sub3 marks");
    int sub3=sc.nextInt();
    System.out.println("enter sub4 marks");
    int sub4=sc.nextInt();
    System.out.println("enter sub5 marks");
    int sub5=sc.nextInt();
    int total=sub1+sub2+sub3+sub4+sub5;
    int per=(total*100)/500;
    System.out.println(per);
    if(per>=90 && per<=100){
      System.out.println("A grade");
    }
    else if(per>=80 && per<=90){
      System.out.println("B grade");
    }
    else if(per>=70 && per<=60){
      System.out.println("C grade");
    }
    else if(per>=60 && per<=70){
       System.out.println("D grade");
    }
    else{
      System.out.println("Fails");
    }
  }
}