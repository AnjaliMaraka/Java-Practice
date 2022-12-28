import java.util.*;
class Throw{
 
  public static void mobileValidation(String mobile){
    if(mobile.length()==10){
      System.out.println("Vaild mobile number");
    }
    else{
      throw new ArithmeticException("Invalid Mobile number");
    }
  }
  public static void main(String args[]){
try{
    mobileValidation("986756342");
}
catch(Exception e){
// e.printStackTrace();
  System.out.println(e.getMessage());
}
  
    
    
  }
}