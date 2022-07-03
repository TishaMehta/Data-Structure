import java.util.Scanner;
public class Replace_number{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entre number");
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
		System.out.println("entre n1");
		int n1=sc.nextInt();
		System.out.println("entre n2");
		int n2=sc.nextInt();
		for(int i=0;i<n;i++){


			
			if(array[i]==n1){
				array[i]=n2;
			}
		}
		for(int i=0;i<n;i++){
			System.out.println("new array element"+array[i]);
		}
	}
}
