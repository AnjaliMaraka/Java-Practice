interface Atm1{
  public void getbalance();
  public void deposit();
  public void withdraw();
  public void display();
}
class SbiAtm implements Atm1{
  int balance=10000;
  public void getbalance(){
     System.out.println(balance);
  }
  public void deposit(){
    int dep=balance+1000;
    System.out.println(dep);
  }
  public void withdraw(){
    int withdraw=balance-200;
    System.out.println(withdraw);
  }
  public void display(){
    System.out.println("visit again");
  }
}
class Atm{
  public static void main(String args[]){
    Atm1 sa=new SbiAtm();
    sa.getbalance();
    sa.deposit();
    sa.withdraw();
    sa.display();
  }
}