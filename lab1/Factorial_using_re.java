import java.util.*;
public class Factorial_using_re{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entre number");
		int num=sc.nextInt();
		System.out.println(factorial(num));
	}
static int factorial(int num){
	if(num>=1){
		return num*factorial(num-1);
	}
	else{
		return 1;
	}
}
}
