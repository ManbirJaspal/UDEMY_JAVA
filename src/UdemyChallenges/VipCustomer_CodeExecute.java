package UdemyChallenges;

/**
 * Created by manbir on 3/22/2017.
 */
public class VipCustomer_CodeExecute {

    public static void main(String[] args) {

        VipCustomer person1= new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("manbir",223345);
        System.out.println(person2.getName());

        VipCustomer person3= new VipCustomer("sunny",100,"sunny@gmail.com");
        System.out.println(person3.getName());


    }
}
