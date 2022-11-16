/*1.Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.*/
class Member{
  String name;
  int age;
  long phno;
  String address;
  int salary;
  void printSalary(){
    System.out.println("salary "+salary);
  }
  
}
class Employee extends Member{
  String speci;
  String dept;
}
class Manager extends Member{
  String speci;
  String dept;
}
  class Problem1{
  public static void main(String args[]){
    Employee em=new Employee();
    em.name="Hani";
    em.age=24;
    em.phno=9381091954l;
    em.address="guntur";
    em.salary=30000;
    em.speci="CSE";
    em.dept="Technical";
    System.out.println(em.name+" "+em.age+" "+em.phno+" "+em.address+" "+em.salary+" "+em.speci+" "+em.dept);
    em.printSalary();
    Manager mg=new Manager();
    mg.name="Hani";
    mg.age=24;
    mg.phno=9381091954l;
    mg.address="guntur";
    mg.salary=20000;
    System.out.println(mg.name+" "+mg.age+" "+mg.phno+" "+mg.address+" "+mg.salary);
    mg.printSalary();
    
  }
}

