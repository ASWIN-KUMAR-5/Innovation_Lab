package Innovation_Lab.Tasks.Day4_and_5;

interface Phone{
	
	void storage();
}

public class Anonymous_inner_class implements Phone {

	public static void main(String[] args) {
		
		Anonymous_inner_class obj = new Anonymous_inner_class() {
			
			@Override
			public void storage() {
				System.out.println("256 GB");
			}
		};
		obj.storage();
	}
}
