import java.util.Scanner;
public class Lab3_1{
	public static void swap(int a, int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("1st number:"+a);
		System.out.println("2nd number:"+b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entre a:");
		int a=sc.nextInt();
		System.out.println("entre b:");
		int b=sc.nextInt();
		swap(a,b);
	}
}