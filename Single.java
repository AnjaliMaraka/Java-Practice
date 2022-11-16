class Animal{
  String color;
  String breed;
  int no_legs;
  void eat(){
    System.out.println("eating");
  }
  void run(){
    System.out.println("running");
  }
}
class Dog extends Animal{
  void bark(){
    System.out.println("Bow bow....");
  }
  void display(){
    System.out.println(color+" "+breed+" "+no_legs);
  }
}
class Single{
  public static void main(String args[]){
    Dog puppy=new Dog();
    puppy.color="black";
    puppy.breed="huch dog";
    puppy.no_legs=4;
    puppy.display();
    puppy.eat();
    puppy.run();
  }
}