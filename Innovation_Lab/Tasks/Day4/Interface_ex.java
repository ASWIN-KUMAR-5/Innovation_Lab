package Innovation_Lab.Tasks.Day4;

interface Playable{
	
	void play();
}

class Guitar implements Playable{

	@Override
	public void play() {
		System.out.println("Playing Guitar");
	}
}

class Piano implements Playable{
	
	@Override
	public void play() {
		System.out.println("Playing Piano");
	}
}
	
public class Interface_ex {
	
	public static void main(String[] args) {
		
		Guitar g = new Guitar();
		Piano p = new Piano();
		
		g.play();
		p.play();
	}

}
