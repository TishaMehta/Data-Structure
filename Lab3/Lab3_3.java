import java.util.Scanner;
class Student_details{
	String enrollment_no;
	String name;
	int sem;
	double cpi;

		Scanner sc= new Scanner(System.in);

	public void Readdetails(){
		System.out.println("entre enrollment_no:");
		enrollment_no=sc.nextLine();
		System.out.println("entre name:");
		name =sc.nextLine();
		System.out.println("entre sem:");
		sem=sc.nextInt();
		System.out.println("entre cpi:");
		cpi=sc.nextDouble();
	}
	public void Display(){
		System.out.println("-------------------------------");
		System.out.println("enrollment_no:"+enrollment_no);
		System.out.println("name:"+name);
		System.out.println("sem:"+sem);
		System.out.println("cpi:"+cpi);
	}

}
public class Lab3_3{
	public static void main(String[] args) {
		Student_details [] ob=new Student_details[5];
		for(int i=0;i<5;i++){
			ob[i]=new Student_details();
			ob[i].Readdetails();
			ob[i].Display();
		}
		
		
	}
}