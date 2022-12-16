import java.util.ArrayList;
public class Box implements ToBeStored {

    private ArrayList<ToBeStored> things;
    private double maxWeight;

    public Box(double maxWeight) {

        this.maxWeight=maxWeight;
        this.things = new ArrayList<ToBeStored>();
    }


    public double  totalWeight(){
        double totalWeight=0;
        ToBeStored element;
        for(int i=0;i<this.things.size();i++){
            element=this.things.get(i);
            totalWeight+=element.weight();
        }
        return totalWeight;
    }

    public void add(ToBeStored thing){
        double totalWeightOfBox = totalWeight();
        if (totalWeightOfBox > this.maxWeight){
            System.out.println("No space in box!");
        }
        else{
            this.things.add(thing);
        }
    }

    public int numberOfThings (){
        int number=0;
        for (int i=0;i<this.things.size();i++){
              number++;
        }
        return number;
    }

    public String toString (){

        double tW= totalWeight();
        int numberofThingss = numberOfThings();

        return "Box: " + numberofThingss + " things, weight: " + tW;
    }


    @Override
    public double weight() {
        return 0;
    }

}
