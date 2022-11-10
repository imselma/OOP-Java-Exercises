public class e3Add {
        public static void main(String[] args) {
            LyyraCard pekka = new LyyraCard(20, "Pekka");
            LyyraCard brian = new LyyraCard(30, "Brian");
    
            pekka.payGourmet();
            brian.payEconomical();
            System.out.println(pekka);
            System.out.println(brian);
    
            pekka.loadMoney(20);
            brian.payGourmet();
    
            System.out.println(pekka);
            System.out.println(brian);
    
            pekka.payEconomical();
            pekka.payEconomical();
    
            brian.loadMoney(50);
            System.out.println(pekka);
            System.out.println(brian);
    
    
        }
 }
