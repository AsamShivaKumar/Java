package oops;

class Vehicles{
int wheels;
String colour;

//Vehicles(){
//	wheels = 4;
//	colour = "black";
//	}
//Vehicles(int noOfWheels){
Vehicles(int wheels){
	this.wheels = wheels;
    colour = "black";
}
Vehicles(int wheels, String colour){
	this.wheels = wheels;
	this.colour = colour;
}
}

public class Constructors {

Constructors(){
	System.out.println("The object is created!!!");
}
	
public static void main(String[] args) {
	
	Constructors obj = new Constructors(); 
	Vehicles car  = new Vehicles(4);
	Vehicles bike = new Vehicles(2);
	Vehicles auto = new Vehicles(3, "Green");
	System.out.println(auto.wheels + "  " + auto.colour);
	System.out.println(car.wheels);
	System.out.println(car.colour);
	System.out.println(bike.wheels);
  }
}
