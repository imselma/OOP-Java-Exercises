public class e1 {
    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());

        barcelona.setMaxSize(1);


        Player brian = new Player("Brian");
        System.out.println("Player: " + brian);
 
        Player pekka = new Player("Pekka", 39);
        System.out.println("Player: " + pekka);

        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1));
       
 
        barcelona.printPlayers();

         
        System.out.println("Number of players: " + barcelona.size());

        System.out.println("Total goals: " + barcelona.goals());



        }
    
}
