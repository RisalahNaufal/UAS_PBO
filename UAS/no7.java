// This is the interface. It defines a set of methods that must be implemented by any class that implements it.
interface Animal {
    void makeNoise();
    void move();
  }
  
  // This is the abstract class. It provides a partial implementation of the Animal interface and can also include abstract methods.
  abstract class Mammal implements Animal {
    protected String name;
    protected int age;
  
    // This is the constructor. It initializes the name and age of the mammal.
    public Mammal(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    // This is an abstract method. It must be implemented by any concrete subclass of Mammal.
    abstract void giveBirth();
  }
  
  // This is a concrete subclass of Mammal. It must implement the giveBirth method.
  class Cat extends Mammal {
    public Cat(String name, int age) {
      super(name, age);
    }
  
    // This method implements the makeNoise method from the Animal interface.
    public void makeNoise() {
      System.out.println("Meow!");
    }
  
    // This method implements the move method from the Animal interface.
    public void move() {
      System.out.println("The cat walks slowly.");
    }
  
    // This method implements the abstract giveBirth method from the Mammal class.
    public void giveBirth() {
      System.out.println("The cat gives birth to a litter of kittens.");
    }
  }
  
  // This is a main class that uses the Cat class.
class Main {
    public static void main(String[] args) {
      Cat myCat = new Cat("Fluffy", 3);
      myCat.makeNoise();
      myCat.move();
      myCat.giveBirth();
    }
  }
  