class Animal {
  String name;
  String species;

  void eat() {
    System.out.println("Eating...");
  }

  void sleep() {
    System.out.println("Sleeping...");
  }
}

class Dog extends Animal {
  String breed;

  void bark() {
    System.out.println("Barking...");
  }
}