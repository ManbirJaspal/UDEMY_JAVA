package UdemyChallenges;

/**
 * Created by manbir on 3/22/2017.
 */
public class VipCustomer {

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        CreditLimit = creditLimit;
        Email = email;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown");
    }

    public VipCustomer() {
        this("Default name", 12345, "Default email");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return CreditLimit;
    }

    public String getEmail() {
        return Email;
    }

    private String name;
    private double CreditLimit;
    private String Email;
}
