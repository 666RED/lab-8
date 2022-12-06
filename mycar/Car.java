package mycar;

public class Car {
	private double kmh;
	
	public Car() {
		kmh = 0;
	}
	
	public void accelerate() {
		kmh += 10;
	}
	
	public void decelerate() {
		kmh -= 5;
	}
	
	public void brake() {
		this.kmh = 0;
	}
	
	public double getKmh() {
		return kmh;
	}
}
