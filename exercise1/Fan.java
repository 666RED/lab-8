package exercise1;

public class Fan {
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	
	public Fan() {
		this.speed = SLOW;
		this.on = false;
		this.radius = 5;
		this.color = "blue";
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setOn(boolean on) {
		this.on = on;
	}
	
	public boolean getOn() {
		return this.on;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void display() {
		System.out.println("Speed: " + this.getSpeed());
		System.out.println("Radius: " + this.getRadius());
		System.out.println("Color: " + this.getColor());
		System.out.println("IsOn: " + this.getOn());
		System.out.println("\n");
	}
	
}
