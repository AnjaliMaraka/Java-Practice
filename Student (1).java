class StudentDet{
  int rollno;
  String name;
  char grade;
  String branch;
  long mobileno;

  void read(){
    System.out.println(name+" reading");
  }
  void write(){
    System.out.println(name+" Writing"); 
  }
  void listen(){
    System.out.println(name+" Listening");
  }
}

class Student{
public static void main(String args[]){
  StudentDet std1=new StudentDet();
  std1.rollno=1234;
  std1.name="Anjali";
  std1.grade='A';
  std1.branch="CSE";
  std1.mobileno=9849273799l;
  System.out.println(std1.rollno+" "+std1.name+" "+std1.grade+" "+std1.branch+" "+std1.mobileno);
  std1.read();
  std1.write();
  std1.listen();
  }
}