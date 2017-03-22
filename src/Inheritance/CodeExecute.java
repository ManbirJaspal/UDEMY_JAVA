package Inheritance;

/**
 * Created by manbir on 3/22/2017.
 */
public class CodeExecute {

    public static void main(String[] args) {

        Animal animal=new Animal("Animal",1,1,5,5);
        Dog dog=new Dog("Bruno",8,20,2,4,1,20,"Long Silky");

        dog.eat();
        dog.walk();
        dog.run();
    }
}
