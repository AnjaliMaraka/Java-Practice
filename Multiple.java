class Animal1{
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
class Dog extends Animal1{
  void bark(){
    System.out.println("Bow bow....");
  }
  
}
class Cat extends Dog{
  void meow(){
    System.out.println("Meow Meow...");
  }
  void display(){
    System.out.println(color+" "+breed+" "+no_legs);
  }
}
class Multiple{
  public static void main(String args[]){
    Cat puppy=new Cat();
    puppy.color="black";
    puppy.breed="huch dog";
    puppy.no_legs=4;
    puppy.display();
    puppy.eat();
    puppy.run();
    puppy.meow();
  }
}