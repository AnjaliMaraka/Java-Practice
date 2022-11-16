/* we have create a student.no,name,marks,grade,branch
  main 5 objects with the help of array*/
import java.util.*;
class Student{
  int stdno;
  String stname;
  String stbranch;
  int marks;
  char grade;
}
class StudentDe{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Student st[]=new Student[3];
    for(int i=0;i<3;i++){
      st[i]=new Student();
      System.out.println("Enter student number");
      st[i].stdno=sc.nextInt();
      System.out.println("Enter student name");
      st[i].stname=sc.next();
      System.out.println("Enter student branch");
      st[i].stbranch=sc.next();
      System.out.println("Enter student marks");
      st[i].marks=sc.nextInt();
      System.out.println("Enter student grade");
      st[i].grade=sc.next().charAt(0);
    }
    for(int i=0;i<3;i++){
      System.out.println(st[i].stdno+" "+st[i].stname+" "+st[i].stbranch+" "+st[i].marks+" "+st[i].grade);
    }
  }
}