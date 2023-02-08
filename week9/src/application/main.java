package application;
public class main {
	public static void main(String[] args) {
		
		//UserInterface ui = new TextUserInterface();
		//new ApplicationLogic(ui).execute(3);
		
		//ConstantSensor ten = new ConstantSensor(10);
		//ConstantSensor minusFive = new ConstantSensor(-5);
		
		//System.out.println(ten.measure());
		//System.out.println(minusFive.measure());
		
		//System.out.println(ten.isOn());
		//ten.off();
		//System.out.println(ten.isOn());
		
		Thermometer kumpula = new Thermometer();
		kumpula.on();
		System.out.println("The temperature in Kumpula is " + kumpula.measure() + " degrees.");
		
		Thermometer kaisaniemi = new Thermometer();
		Thermometer helsinkiVantaa = new Thermometer();
		
		AverageSensor helsinkiArea = new AverageSensor();
		helsinkiArea.addSensor(kumpula);	
		helsinkiArea.addSensor(kaisaniemi);	
		helsinkiArea.addSensor(helsinkiVantaa);	
		
		helsinkiArea.on();
		System.out.println("The temperature in Helsinki area is " + helsinkiArea.measure() + " degrees.");
		
		System.out.println("Readings: " + helsinkiArea.readings());
		}
}
