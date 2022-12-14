import java.util.*;
abstract class Student1{
  int id;
  String name;
  public void read(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter id");
    id=sc.nextInt();
    System.out.println("enter name");
    name=sc.next();
  
  }
  public void display(){
    System.out.println(id+" "+name);  
  }
  abstract public void grade();
}
class Student2 extends Student1{
  public void grade(){
    int marks=54;
    if(marks>90){
      System.out.println("Grade A");
    }
    else if(marks>80&&marks<90){
      System.out.println("Grade B");
    }
    else {
      System.out.println("fail");
    }
    
  }
}
class Student{
  public static void main(String args[]){
    Student1 std=new Student2();
    std.read();
    std.display();
    std.grade();
  }
}