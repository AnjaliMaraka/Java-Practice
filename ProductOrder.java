import java.util.*;
class ProductDetails{
  int product_id;
  String product_name;
  String product_brand;
  int product_quantity;
  void ordereligibility(int quantity){
    if(quantity<10){
      System.out.println("order not taken");
    }
    else{
      System.out.println("order taken");
    }
  }
  
}
class ProductOrder{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ProductDetails pd=new ProductDetails();
    pd.product_id=234;
  pd.product_name="laptop";
  pd.product_brand="dell";
  pd.product_quantity=20;
    pd.ordereligibility(pd.product_quantity);
  }
}