class Animal {
    // attribute to store the number of legs
    private int legs;

    // constructor to set the number of legs
    public Animal(int legs) {
        this.legs = legs;
    }

    // method to walk
    public void walk() {
        System.out.println("Walking on " + legs + " legs");
    }

    // method to eat
    public void eat() {
        System.out.println("Eating");
    }
}

// interface to define behavior for pets
interface Pet {
    // method to get the name of the pet
    String getName();

    // method to set the name of the pet
    void setName(String name);

    // method to play with the pet
    void play();
}

class Spider extends Animal {
    // constructor to set the number of legs for the spider
    public Spider() {
        super(8);
    }

    // override the eat method to specify behavior for spiders
    @Override
    public void eat() {
        System.out.println("Eating insects");
    }
}

class Cat extends Animal implements Pet {
    // attribute to store the name of the cat
    private String name;

    // constructor to set the number of legs and name of the cat
    public Cat(String name) {
        super(4);
        this.name = name;
    }

    // default constructor to set the number of legs to 4
    public Cat() {
        this("");
    }

    // method to get the name of the cat
    @Override
    public String getName() {
        return name;
    }

    // method to set the name of the cat
    @Override
    public void setName(String name) {
        this.name = name;
    }

    // method to play with the cat
    @Override
    public void play() {
        System.out.println("Playing with " + name);
    }

    // override the eat method to specify behavior for cats
    @Override
    public void eat() {
        System.out.println("Eating cat food");
    }
}

class Fish extends Animal implements Pet {
    // attribute to store the name of the fish
    private String name;

    // constructor to set the number of legs to 0 and the name of the fish
    public Fish(String name) {
        super(0);
        this.name = name;
    }

    // default constructor to set the number of legs to 0
    public Fish() {
        this("");
    }

    // method to get the name of the fish
    @Override
    public String getName() {
        return name;
    }

    // method to set the name of the fish
    @Override
    public void setName(String name) {
        this.name = name;
    }

    // method to play with the fish
    @Override
    public void play() {
        System.out.println("Playing with " + name + " in the fish tank");
    }}

    // override the walk method to specify that fish cannot walk
   
