import java.util.*;
class StudentDe{
  int stno;
  String name;
  String branch;
  int marks;
  StudentDe(){
    stno=123;
    name="Anitha";
    branch="cse";
    marks=345;
  }
  StudentDe(int num,String branch,String name,int marks){
    this.stno=num;
    this.branch=branch;
    this.name=name;
    this.marks=marks;
  }
}
class Student{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    StudentDe st=new StudentDe();
     System.out.println(st.name);
    StudentDe st1=new StudentDe(1122,"CSE","vanitha",345);
    System.out.println(st1.stno+" "+st1.branch+" "+st1.name+" "+st1.marks);
    
  }
}