import bitlabs.Welcome;
class Student1{
  private int rollno;
  private String name;
  void setRollno(int rollno){
    this.rollno=rollno;
  }
  void setName(String name){
    this.name=name;
  }
  int getRollno(){
    return rollno;
  }
  String getName(){
    return name;
  }
}
class Student extends Welcome{
  public static void main(String args[]){
        Student w = new Student();
        w.message();

 
    // Student1 st=new Student1();
    // st.setRollno(1234);
    // st.setName("anjali");
    // System.out.println(st.getRollno()+" "+st.getName());
  }
}