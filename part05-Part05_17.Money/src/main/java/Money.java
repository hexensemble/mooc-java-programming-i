
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();

        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        double thisDecimalCents = (double) this.cents / 100;
        double thisTotal = (double) this.euros + thisDecimalCents;

        double comparedDecimalCents = (double) compared.cents / 100;
        double comparedTotal = (double) compared.euros + comparedDecimalCents;

        if (thisTotal < comparedTotal) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {
        int eurosDecreased = this.euros - decreaser.euros;
        int centsDecreased = this.cents - decreaser.cents;

        if (centsDecreased < 0) {
            eurosDecreased--;
            centsDecreased = 100 - decreaser.cents;
        }

        if (eurosDecreased < 0) {
            eurosDecreased = 0;
            centsDecreased = 0;
        }

        Money sum = new Money(eurosDecreased, centsDecreased);

        return sum;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
