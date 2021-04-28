import java.util.HashSet;
import java.util.Set;

import javax.smartcardio.Card;

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

    // bind bank account to user account
    public void addBankAccount(Card card){
        UserAccount ua = new UserAccount(this);
        accounts.add(ua);
    }
}
