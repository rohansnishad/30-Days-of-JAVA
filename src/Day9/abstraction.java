package Day9;

abstract class Animal {
    abstract void sound();  // abstract method

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}


public class abstraction extends Dog {
    public static void main(String[] args){
        Animal A = new Dog();
        A.sleep();
        A.sound();
    }

}
