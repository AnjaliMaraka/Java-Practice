
/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/
import java.util.*;
import java.io.*;

class Student {
  private String name;
  private int marks;
  private String city;

  void setName(String name) {
    this.name = name;
  }

  void setMarks(int marks) {
    this.marks = marks;
  }

  void setCity(String city) {
    this.city = city;
  }

  String getName() {
    return name;
  }

  int getMarks() {
    return marks;
  }

  String getCity() {
    return city;
  }
}

class NullPointer {
  public static void main(String args[]) {
    Student st = null;
    try {
      st.setName("anjali");
      st.setMarks(35);
      st.setCity("Gun");
      System.out.println(st.getName() + " " + st.getMarks() + " " + st.getCity());
    }

    catch (NullPointerException e) {
      e.printStackTrace();
    }
    System.out.println("Exception Handeled");
  }
}