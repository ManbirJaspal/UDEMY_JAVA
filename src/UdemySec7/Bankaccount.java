package UdemySec7;

/**
 * Created by manbir on 3/22/2017.
 */
public class Bankaccount {


        private String AccNumber;
        private double AccBalance;
        private String Customername;
        private String Email;
        private String PhoneNumber;

        public Bankaccount() {
        }

        public String getAccNumber() {
            return this.AccNumber;
        }

        public void setAccNumber(String accNumber) {
            this.AccNumber = accNumber;
        }

        public double getAccBalance() {
            return this.AccBalance;
        }

        public void setAccBalance(double accBalance) {
            this.AccBalance = accBalance;
        }

        public String getCustomername() {
            return this.Customername;
        }

        public void setCustomername(String customername) {
            this.Customername = customername;
        }

        public String getEmail() {
            return this.Email;
        }

        public void setEmail(String email) {
            this.Email = email;
        }

        public String getPhoneNumber() {
            return this.PhoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.PhoneNumber = phoneNumber;
        }

        public void DepositFunds(double Dep) {
            this.AccBalance += Dep;
            System.out.println("current account balance after depositing is  " + this.AccBalance);
        }

        public void WithdrawFunds(double Withdraw) {
            if(this.AccBalance - Withdraw <= 0.0D) {
                System.out.println("insufficient funds, only " + this.AccBalance + " remaining");
            } else {
                this.AccBalance -= Withdraw;
                System.out.println("current account balance after Withdrawing is  " + this.AccBalance);
            }

        }

        public static void main(String[] args) {
            Bankaccount BA1 = new Bankaccount();
            BA1.WithdrawFunds(100.0D);
        }

    }
