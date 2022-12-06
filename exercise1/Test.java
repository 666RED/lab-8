package exercise1;

public class Test {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		fan1.setSpeed(Fan.SLOW);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		
		Fan fan2 = new Fan();
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		
		System.out.println("Fan1");
		fan1.display();
		
		System.out.println("Fan2");
		fan2.display();
	}

}
