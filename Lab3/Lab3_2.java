import java.util.Scanner;
class Employee_details{
	int employee_id;
	String name;
	String designation;
	double salary;
	public void readDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("entre employee_id:");
		employee_id=sc.nextInt();
		System.out.println("entre name:");

		name=sc.next();
		System.out.println("entre designation:");
		designation=sc.next();
		System.out.println("entre salary:");
		salary=sc.nextDouble();
	}
	public void printDetails(){
		System.out.println("---print details---");
		System.out.println("employee_id:"+employee_id);
		System.out.println("name:"+name);
		System.out.println("designation:"+designation);
		System.out.println("salary:"+salary);
	}
}
public class Lab3_2{
	public static void main(String[] args) {
		
	Employee_details e=new Employee_details();
	e.readDetails();
	e.printDetails();	
	}
}

