//class id,name,salary,creat object.
class Employee{
  private int id;
  private String name;
  private int salary;
  void setId(int id){
    this.id=id;
  }
  void setName(String name){
    this.name=name;
  }
  void setSalary(int salary){
    this.salary=salary;
  }
  int getId(){
    return id;
  }
  String getName(){
    return name;
  }
  int getSalary(){
    return salary;
  }
}
class Example{
  public static void main(String args[]){
    Employee em=new Employee();
    em.setId(123);
    em.setName("Anjali");
    em.setSalary(20000);
    System.out.println(em.getId()+" "+em.getName()+" "+em.getSalary());
  }
}