/* we have create a student.no,name,marks,grade,branch
  main 5 objects with the help of array*/
import java.util.*;
class Student{
  int stdno;
  String stname;
  String stbranch;
  int marks;
  char grade;
  Scanner sc=new Scanner(System.in);
  void input(){
    System.out.println("Enter student number");
      stdno=sc.nextInt();
      System.out.println("Enter student name");
      stname=sc.next();
      System.out.println("Enter student branch");
      stbranch=sc.next();
      System.out.println("Enter student marks");
      marks=sc.nextInt();
      System.out.println("Enter student grade");
      grade=sc.next().charAt(0);
  }
  void display(){
    System.out.println("student number= "+stdno);
    System.out.println("student name= "+stname);
    System.out.println("student branch= "+stbranch);
    System.out.println("student marks= "+marks);
    System.out.println("student grade= "+grade);
  }
}
class StudentDe2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Student st[]=new Student[3];
    for(int i=0;i<3;i++){
      st[i]=new Student();
      st[i].input();
    }
    for(int i=0;i<3;i++){
      st[i].display();
    }
  }
}