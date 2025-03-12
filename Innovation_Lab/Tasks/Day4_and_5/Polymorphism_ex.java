package Innovation_Lab.Tasks.Day4_and_5;

class Vechile{
	
	void start() {
		System.out.println("Strat your Vechile");
	}
}

class Car extends Vechile{
	
	@Override
	void start() {
		System.out.println("Start your Bike");
	}
}

class Bike extends Vechile{
	
	@Override
	void start() {
		System.out.println("Start your Car");
	}
	
	
}

public class Polymorphism_ex {
	
	public static void main(String[] args) {
		
		Car v1 = new Car();
		Bike v2 = new Bike();
		
		v1.start();
		v2.start();

	}
}

