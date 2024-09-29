package prac1;
class Vehicle{
	public void drive() {
		System.out.println("driving");
	}
}
class Car extends Vehicle{
	public void drive() {
		System.out.println("Repairing a car");

	}
}
public class Vehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car o=new Car();
		o.drive();

	}

}
