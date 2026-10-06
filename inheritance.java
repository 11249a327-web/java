// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// SINGLE INHERITANCE
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// MULTILEVEL INHERITANCE
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

// HIERARCHICAL INHERITANCE
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// MULTIPLE INHERITANCE USING INTERFACES
interface Father {
    void father();
}

interface Mother {
    void mother();
}

class Child implements Father, Mother {

    public void father() {
        System.out.println("Child gets father's property");
    }

    public void mother() {
        System.out.println("Child gets mother's property");
    }
}

// MAIN CLASS
public class inheritance {

    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("SINGLE INHERITANCE");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println();

        // Multilevel Inheritance
        System.out.println("MULTILEVEL INHERITANCE");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();

        System.out.println();

        // Hierarchical Inheritance
        System.out.println("HIERARCHICAL INHERITANCE");

        Dog d1 = new Dog();
        d1.eat();
        d1.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();

        System.out.println();

        // Multiple Inheritance
        System.out.println("MULTIPLE INHERITANCE USING INTERFACES");
        Child ch = new Child();
        ch.father();
        ch.mother();
    }
}