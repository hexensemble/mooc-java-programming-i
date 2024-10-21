
public class YourFirstAccount {

    public static void main(String[] args) {

        Account myAccount = new Account("Me", 100.0);

        myAccount.deposit(20.0);

        System.out.println(myAccount);
    }
}
