import java.util.Scanner;
public class Lab3_1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entre n1:");
		int n1=sc.nextInt();
		System.out.println("entre n2:");
		int n2=sc.nextInt();
		int temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("n1:"+n1);
		System.out.println("n2:"+n2);
	}
}
