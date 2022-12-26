import java.util.*;
class Student{
  int id;
  String name;
  Student(int id,String name){
    this.id=id;
    this.name=name;
  }
}
class StudentH{
  public static void main(String args[]){
    HashMap<Integer,Student> map=new HashMap<Integer,Student>();
    map.put(1,new Student(11," Anjali"));
    map.put(2,new Student(22," Anitha"));
    map.put(3,new Student(33," Anusha"));
    map.put(4,new Student(44," Anila"));
    for(Map.Entry m:map.entrySet()){
      Student std=(Student)m.getValue();
      System.out.println(m.getKey());
      System.out.println(std.id+""+std.name);
    }
    
  }
}
