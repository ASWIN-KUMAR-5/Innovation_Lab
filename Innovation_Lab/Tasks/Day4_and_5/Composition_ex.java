package Innovation_Lab.Tasks.Day4_and_5;

class Battery{
	int capacity=5500;
}

class Mobile{
	Battery b;
	
	Mobile(){
		b = new Battery();
	}
	
	void display() {
		System.out.println("my mobile battery capacity is "+b.capacity);
	}
	
}

public class Composition_ex {
	
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.display();
	}

}
