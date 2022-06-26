import java.util.*;
public class Factorial{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entre number");
		int n=sc.nextInt();
		int ans=1;
		if(n>0){
		for(int i=n;i>=1;i--){
				ans=ans*i;
			}
			System.out.println(ans);
		}
	}
}
