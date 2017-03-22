package Inheritance;

/**
 * Created by manbir on 3/22/2017.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) { //initialized the basic animal features
        super(name,1,1, size, weight); //super keyword is used to call a constructor from a parent class

        this.eyes=eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called!");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called!!");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("dog.walk() called");
        move(5);
    }

    public void run() {
        System.out.println("dog.run() called!");
        move(10);
    }
}
