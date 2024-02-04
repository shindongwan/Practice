//cars
class Car {
	
	private String color;
	private int speed = 0;
	static int count = 0;
	
	public Car() {
		count ++;
	}
	
	public static int getCount() {
		return count;
	}
	
	
//	public Car(String color) {
//		super();
//		this.color = color;
//	}
//
//
//	public Car(String color, int speed) {
//		this.color = color;
//		this.speed = speed;
//	}
	
	public void upSpeed(int value) {
		if( speed + value > 200) 
			speed = 200;
		else
			speed += value;
		System.out.println("Currernt speed = " + speed);
		
	}
	
	public void downSpeed(int value) {
		if( speed - value < 0) {
			speed = 0;			
		} else
			speed = speed - value;
		
		System.out.println("Current speed = " + getSpeed());
	}

	/**
	 * @return the color
	 */
	String getColor() {
		return color;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}


	
	

}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar1 = new Car();
		System.out.println("number of cars = " + myCar1.getCount());
//		Car myCar2 = new Car("red");
//		Car myCar3 = new Car("blue", 30);
		Car myCar2 = new Car();
		System.out.println("number of cars = " + myCar2.getCount());
		Car myCar3 = new Car();
		System.out.println("number of cars = " +  myCar3.getCount());
		
		System.out.println("number of Cars = " + Car.getCount());
		
//		System.out.println("color of car 1 = " + myCar1.getColor() + " speed = " + myCar1.getSpeed());
//		System.out.println("color of car 2 = " + myCar2.getColor() + " speed = " + myCar2.getSpeed());		
//		System.out.println("color of car 3 = " + myCar3.getColor() + " speed = " + myCar3.getSpeed());		

	}

}
