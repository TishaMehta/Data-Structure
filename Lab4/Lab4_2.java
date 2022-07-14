import java.util.Scanner;
class ValidString{
	int top=-1;
	int a=0;
	int b=0;
	char [] arr=new char[100];
	public void push(char x){
		if(top>=100){
			System.out.println("stack overflow");

		}
		else{
			top=top+1;
			arr[top]=x;
		}
	}
	public char pop(){
		if(top<0){
			System.out.println("stack underflow");
			return 0;
		}
		else{
			char s = arr[top];
			top--;
			return s;
		}
	}
	public void equaleAandB(int l){
		for(int i=0;i<l;i++){
			char s=pop();
			if(s=='a'){
				a++;
			}
			if(s=='b'){
				b++;
			}
		}
		if(a==b){
			System.out.println("valid string");
		}
		else{
			System.out.println("invalid string");
		}
	}
}
public class Lab4_2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ValidString c=new ValidString();
		System.out.println("entre string:");
		String str=sc.next();
		int l=str.length();
		for(int i=0;i<l;i++){
			c.push(str.charAt(i));
		} 
		c.equaleAandB(l);
	}
}