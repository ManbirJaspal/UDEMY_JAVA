package UdemyChallenges;

/**
 * Created by manbir on 3/29/2017.
 */
public class Polymorphism {

    public static void main(String args[]) {
        Cars cars = new Cars("Base car",8);
        System.out.println(cars.startEngine());
        System.out.println(cars.accelerate());
        System.out.println(cars.brake());

        Porsche porsche = new Porsche("Carrera",8);
        System.out.println(porsche.startEngine());
        System.out.println(porsche.accelerate());
        System.out.println(porsche.brake());

        Dodge dodge = new Dodge("Challenger",6);
        System.out.println(dodge.startEngine());
        System.out.println(dodge.accelerate());
        System.out.println(dodge.brake());

        BMW bmw = new BMW("X6",4);
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());


    }
}

class Cars {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Cars(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels=4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }


    public String startEngine() {
        return "Engine Start";
    }

    public String accelerate() {
        return "Accelerating";
    }

    public String brake() {
        return "Brakes Applied";
    }

}

class Porsche extends Cars {

    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Porsche engine starting";
    }

    @Override
    public String accelerate() {
        return "Porsche accelerating";
    }

    @Override
    public String brake() {
        return "Porsche breaking";}
}

class BMW extends Cars {

    public BMW(String name, int cylinders) {
        super(name, cylinders);
    }



    @Override
    public String startEngine() {
        return "BMW engine starting";
    }

    @Override
    public String accelerate() {
        return "BMW accelerating";
    }

    @Override
    public String brake() {
        return "BMW breaking";}
}

class Dodge extends Cars {

    public Dodge(String name, int cylinders) {
        super(name, cylinders);
    }



    @Override
    public String startEngine() {
        return "Dodge engine starting";
    }

    @Override
    public String accelerate() {
        return "Dodge accelerating";
    }

    @Override
    public String brake() {
        return "Dodge breaking";}
}
