package Inheritance;

/**
 * Created by manbir on 3/22/2017.
 */
public class Animal {

    private String Name;
    private int Brain;
    private int Body;
    private int Size;
    private int Weight;


    public Animal(String name, int brain, int body, int size, int weight) {
        Name = name;
        Brain = brain;
        Body = body;
        Size = size;
        Weight = weight;
    }

    public void eat(){//the methods which are public in the Parent class are directly accessible to the child class(dog);

        System.out.println("Animal.eat() called");
    }

    public void move(int speed){
        System.out.println("Animal moving at speed of  "+ speed);

    }
    public String getName() {
        return Name;
    }

    public int getBrain() {
        return Brain;
    }

    public int getBody() {
        return Body;
    }

    public int getSize() {
        return Size;
    }

    public int getWeight() {
        return Weight;
    }
}


