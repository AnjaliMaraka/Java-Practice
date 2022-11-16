// Book

// name
// price
// author

// author

// name
// age
// place
import java.util.*;
class Book1{
  String name;
  double price;
  Auther auther;
  Book1(String name,double price,Auther auther){
    this.name=name;
    this.price=price;
    this.auther=auther;
    
  }
}
class Auther{
  String name;
  int age;
  String place;
  Auther(String name,int age,String place){
    this.name=name;
    this.age=age;
    this.place=place;
  }
  
}
class Book{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Auther auther=new Auther("Michel",38,"Mexico");
    Book1 book=new Book1("Mistory",200,auther);
    System.out.println(book.name+" "+book.price);
    System.out.println(auther.name+" "+auther.age+" "+auther.place);
  }
}