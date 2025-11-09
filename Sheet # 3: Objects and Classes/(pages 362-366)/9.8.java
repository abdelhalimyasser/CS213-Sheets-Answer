public class Main
{
	public static void main(String[] args) {
		Fan fan1 = new Fan();
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);

		Fan fan2 = new Fan();
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
		
	}
}

class Fan {
	// class variabels
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;

	private int speed;
	private boolean on;
	private double radius;
	public String color;

	// class constractor
	public Fan() {
		this.speed = 1;
		this.on = false;
		this.radius = 5.0;
		this.color = "blue";
	}

	// class setter methods
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// class getter methods
	public int getSpeed() {
		return this.speed;
	}

	public boolean getOn() {
		return this.on;
	}

	public double getRadius() {
		return this.radius;
	}

	public String getcolor() {
		return this.color = color;
	}

	@Override
	public String toString() {
		return this.on ? ("The Fan Speed: " + this.speed + 
		                  "\nThe Fan Color: " + this.color + 
		                  "\nThe Fan Radius: " + this.radius + "\n") : 
		                  "Fan is off";
	}
}
