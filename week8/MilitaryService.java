public class MilitaryService implements NationalService {

    private int daysLeft;

    public MilitaryService(int daysLeft){
        this.daysLeft=daysLeft;
    }

    @Override
    public int getDaysleft() {
        return 0;
    }

    @Override
    public void work() {

        this.daysLeft--;
        
    }
    
}
