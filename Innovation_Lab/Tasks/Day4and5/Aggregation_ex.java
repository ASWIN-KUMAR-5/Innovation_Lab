package Innovation_Lab.Tasks.Day4and5;

class Employee{
	
	int employee_id;
	String employee_name;
	
	Employee(int id,String name){
		this.employee_id=id;
		this.employee_name=name;
	}
	
	
}

class Department{
	Employee e;
	
	Department(Employee e){
		this.e=e;
	}
	
	void display() {
		System.out.println("Employee id: "+e.employee_id);
		System.out.println("Employee name: "+e.employee_name);
	}
}

public class Aggregation_ex {
	
	public static void main(String[] args) {
		
		Employee e = new Employee(1234,"Aswin");
		Department d = new Department(e);
		d.display();
		
	}
}
