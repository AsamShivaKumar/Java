package oops.abstraction;

public class RepairShop {

	public static void repairCar(Car car) {
		System.out.println("The car is repaired!");
	}
	public static void main(String[] args) {

		Audi a1 = new Audi();
		RangeRover r1 = new RangeRover();
		
		a1.accelerate();
		r1.brake();
		repairCar(a1);
		repairCar(r1);

	}

}
