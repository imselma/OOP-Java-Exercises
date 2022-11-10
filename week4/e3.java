public class e3 {
    public static void main(String[] args) {
        LyyraCard card = new LyyraCard(50);
        System.out.println(card);

        card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);

        card.loadMoney(34);
        System.out.println(card);

        card.loadMoney(-15);
        System.out.println(card);
    }
}

