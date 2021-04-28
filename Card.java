public class Card {
    private Integer cardNum = null;
    private String cardHolder = null;
    private String validDate;
    private int secCode;
    private int pin;
    public String userName;

    public Card(Integer cardNum, String cardHolder, String validDate, int secCode, int pin) {
        this.cardNum = cardNum;
        this.cardHolder = cardHolder;
        this.validDate = validDate;
        this.secCode = secCode;
        this.pin = pin;
    }

    public int getPin() {
        return this.pin;
    }

    public void addToBankAccount(){
        BankAccount.addBankAccount(this);
    }
}
