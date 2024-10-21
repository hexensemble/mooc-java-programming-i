
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void addMoney(double amount) {
        if (this.balance + amount < this.balance) {

        } else {
            this.balance = this.balance + amount;

            if (this.balance > 150) {
                this.balance = 150;
            }
        }

    }

    public void eatAffordably() {
        if (this.balance - 2.60 < 0) {

        } else {
            this.balance = this.balance - 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance - 4.60 < 0) {

        } else {
            this.balance = this.balance - 4.60;
        }
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }

}
