import java.util.HashSet;
import java.util.Set;

public class BankAccount extends Card{
    static Set<Card> accounts = new HashSet<>();
    private Card card;
    
    public BankAccount(Integer cardNum, String cardHolder, String validDate, int secCode,int pin, Card card) {
        super(cardNum, cardHolder, validDate, secCode, pin);
        this.card = card;
    }

    public int getPin() {
        return this.card.getPin();
    }

    // add user account to bankaccount
    public static void addBankAccount(Card card){
        accounts.add(card);
    }
}
