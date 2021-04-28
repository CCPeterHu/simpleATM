public class UserAccount {
    private int balance = 0;
    private BankAccount ba;

    public UserAccount(BankAccount ba) {
        this.ba = ba;
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