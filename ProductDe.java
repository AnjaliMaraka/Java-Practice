import java.util.*;
class Product{
  int id;
  String name;
  int price;
  int quantity;
  Product(int id,String name,int price,int quantity){
    this.id=id;
    this.name=name;
    this.price=price;
    this.quantity=quantity;
  }
}
interface ProductDetails{
  public void insertDetails(ArrayList<Product> p);
  public void searchDetails(ArrayList<Product> p,int id);
  public void displayDetails(ArrayList<Product> p);
  public void updateDetails(ArrayList<Product> p,int id);
  public void deleteDetails(ArrayList<Product> p,int id);
  public void viewPoint();
}
class ProductDetailsImpl implements ProductDetails{
  public void viewPoint(){
    System.out.println("1.insert");
    System.out.println("2.search");
    System.out.println("3.display");
    System.out.println("4.update");
    System.out.println("5.delete");
    System.out.println("0.Exit");
  }
  public void insertDetails(ArrayList<Product> p){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Details");
    p.add(new Product(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt()));
    System.out.println("Enter Details");
    p.add(new Product(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt()));
    if(p.isEmpty()){
      System.out.println("Not inserted");
    }
    else{
      System.out.println("inserted successfully");
    }
  }
   public void searchDetails(ArrayList<Product> p,int id){
     for(Product obj:p){  
      if(obj.id==id){ 
         System.out.println(obj.id+" "+obj.name+" "+obj.price+" "+obj.quantity);
      }
      else{
        System.out.println("id not matched");
      }
    }
   }
  public void displayDetails(ArrayList<Product> p){
    for(Product obj:p){
      System.out.println(obj.id+" "+obj.name+" "+obj.price+" "+obj.quantity);
    }
  }
  public void updateDetails(ArrayList<Product> p,int id){
    for(Product obj:p){
      if(obj.id==id){
        obj.price=600;
        System.out.println(obj.id+" "+obj.name+" "+obj.price+" "+obj.quantity);
      }
      else{
        System.out.println("Record not matched");
      }
    }
  }
  public void deleteDetails(ArrayList<Product> p,int id){
    Product pdt=null;
    for(Product obj:p ){
      if(obj.id==id){  
        pdt=obj;
      }
      
    }
    if(pdt==null){ 
        System.out.println("invalid");
      }
      else{
        p.remove(pdt);
        System.out.println("Deleted ");
      }
  }
}
class ProductDe{
  public static void main(String args[]){
    ProductDetails pd=new ProductDetailsImpl();
    ArrayList<Product> list=new ArrayList<Product>();
    pd.displayDetails(list);
    pd.viewPoint();
    int num;
    do{
      System.out.println("Choose option");
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      if(num==1){
        pd.insertDetails(list);
      }
      else if(num==2){
        pd.searchDetails(list,2);
      }
      else if(num==3){
        pd.displayDetails(list);
      }
      else if(num==4){
        pd.updateDetails(list,1);
      }
      else if(num==5){
        pd.deleteDetails(list,2);
      }
    }
      while(num!=0);{
        System.out.println("Thank you");
      }
  }
}