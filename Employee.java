class Employee{
  String ename;
  int eid;
  int esalary;
  String edep;
  long ephonum;
  void grossSalary(int esalary){
    if(esalary<1000){
      int gs=2000+2000+esalary;
      System.out.println(gs);
    }
    else{
      int gs=1000+1000+esalary;
      System.out.println(gs);
    }
  }
  void insurence(int esalary){
    if(esalary<1000){
      System.out.println("Not eligible");
    }
    else{
      System.out.println("Eligible");
    }
  }
  public static void main(String args[]){
    Employee em1=new Employee();
    em1.eid=231;
    em1.ename="Anjali";
    em1.edep="Development";
    em1.esalary=2500;
    em1.ephonum=9849273799l;
    System.out.println(em1.eid+" "+em1.ename+" "+em1.edep+" "+em1.esalary+" "+em1.ephonum);
    em1.grossSalary(em1.esalary);
    em1.insurence(em1.esalary);
    
  }
}