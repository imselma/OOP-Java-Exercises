public class LyyraCard {

    private double balance;
    private String name;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;

    }

    public LyyraCard(double balanceAtStart, String name){
        this.balance = balanceAtStart;
        this.name = name;
    }

    public String toString() {
        return "The card has " + this.balance + " euros.";
    }

    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance -= 2.5;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.0) {
            this.balance -= 4.0;
        }

    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            if ((this.balance + amount) > 150) {
                this.balance = 150;
            } else {
                this.balance += amount;
            }
        }
    }
}
