public class UserAccount {
    private int balance = 0;
    private String accountName;

    public UserAccount(String cardHolader) {
        this.accountName = cardHolader;
    }
    
    public void deposite(int amount){
        this.balance += amount;
    }

    public void withdraw(int amount){
        this.balance -= amount;
    }

    public int getBalance(){
        return this.balance;
    }
}