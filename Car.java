package week1.day1;

public class Car {
	public void applyBrake() {
		System.out.println("Apply Brake");
		
	}
	public void applyGear() {
		System.out.println("Apply Gear");
		
	}
	public void switchOnAC() {
		System.out.println("Switch ON AC");
		
	}
	public void applyAccelerate() {
		System.out.println("Apply Accelerator");
	}

	public static void main(String[] args) {
		Car obj=new Car();
		obj.applyBrake();
		obj.applyGear();
		obj.switchOnAC();
		obj.applyAccelerate();

	}

}
