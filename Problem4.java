/*Create a class named 'Shape' with a method to print "This is This is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.*/
import java.util.*;
class Shape{
  void shape(){
    System.out.println("this is shape");
  }
}
class Rectangle extends Shape{
  void rectangle(){
    System.out.println("this is rectangular shape");
  }
}
class Circle extends Shape{
  void circle(){
    System.out.println("this is circular shape");
  }
}
class Square extends Rectangle{
  void square(){
  System.out.println("Square is a rectangle");
  }
}
class Problem4{
  public static void main(String args[]){
    Square s=new Square();
    s.rectangle();
    s.shape();
    s.square();
  }
}