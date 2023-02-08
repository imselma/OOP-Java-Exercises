package application;
import java.util.Random;

public class Thermometer implements Sensor {
	
	private boolean sensor;
	
	public Thermometer () {
	     this.sensor=false;
	}

	@Override
	public boolean isOn() {
	   return this.sensor;
	}

	@Override
	public void on() {
		this.sensor=true;
		
	}

	@Override
	public void off() {
		this.sensor=false;
		
	}

	@Override
	public int measure() {
		Random rand = new Random();;
		if (!this.isOn()) {
			throw new  IllegalStateException();
		}
	else{
		
		   return rand.nextInt(-30,30);
			
		}
	}

}
