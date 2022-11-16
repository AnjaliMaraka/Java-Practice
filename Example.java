class Address{
  String state;
  String city;
  String street;
  int dno;
  Address(String state,String city,String street,int dno){
    this.state=state;
    this.city=city;
    this.street=street;
    this.dno=dno;
  }
}
class Employee{
  int eid;
  String ename;
  String edept;
  int esalary;
  Address address; 
  Employee(int eid,String ename,String edept,int esalary,Address address){
    this.eid=eid;
    this.ename=ename;
    this.edept=edept;
    this.esalary=esalary;
    this.address=address;
  }
  void display(){
    System.out.println(eid+" "+ename+" "+edept+" "+esalary);
    System.out.println(address.state+" "+address.city+" "+address.street+" "+address.dno);
}
}
class Example{
  public static void main(String args[]){
    Address address1=new Address("AP","Vijayawada","Madhapur colony",23);
    Address address2=new Address("AP","Guntur","Gurunank Colony",123);

    Employee emp1=new Employee(34,"lalitha","IT",50000,address1);
    Employee emp2=new Employee(45,"kavitha","Accounts",60000,address2);
    emp1.display();
    emp2.display();
    
   
  }
}