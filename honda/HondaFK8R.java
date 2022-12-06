package honda;

import mycar.Car;

public class HondaFK8R {
	
	public static void main(String[] args) {
		
		double speed = 0;

		Car car = new Car();
		
		for(int i = 0; i < 10; i++) {
			car.accelerate();
		}
		
		speed = car.getKmh();
		System.out.println("After acceleration of 10 times");
		System.out.println("Speed: " + speed + " kmh\n");

		car.decelerate();
		car.decelerate();
		
		speed = car.getKmh();
		System.out.println("After deceleration of 2 times");
		System.out.println("Speed: " + speed + " kmh\n");

		car.accelerate();
		car.accelerate();
		car.accelerate();

		speed = car.getKmh();
		System.out.println("After acceleration of 3 times");
		System.out.println("Speed: " + speed + " kmh\n");

		car.brake();
		speed = car.getKmh();
		System.out.println("After brake");
		System.out.println("Speed: " + speed + " kmh\n");
	}

}
