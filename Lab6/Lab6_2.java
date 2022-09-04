import java.util.Scanner;
class EvaluationPrefix{
	int top=-1;
	int value;
	int s[]=new int[100];
	public void push(int c){
		if(top>=100){
			System.out.println("stack overflow");
		}
		else{
			top++;
			s[top]=c;
		}
	}
	public int pop(){
		if(top<0){
			System.out.println("stack underflow");
			return 0;
		}
		else{
			top--;
			return s[top+1];
		}
	}
	public int operation(int op1,int op2,char y){
		if(y=='+'){
			return(op1+op2);
		}
		else if(y=='-'){
			return(op1-op2);
		}
		else if(y=='*'){
			return(op1*op2);
		}
		else if(y=='/'){
			return(op1/op2);
		}
		else{
			return ((int)Math.pow(op2,op1));
		}
	}
	public void evalution(String str){
		for(int i=str.length()-1;i>=0;i--){
			boolean flag=Character.isDigit(str.charAt(i));
			if(flag){
				push(Character.getNumericValue(str.charAt(i)));
			}
			else{
				value=operation(pop(),pop(),str.charAt(i));
			}
		}
		System.out.println("ans:"+value);
	}
}
public class Lab6_2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entre expression:");
		String expression=sc.nextLine();
		EvaluationPrefix ep=new EvaluationPrefix();
		ep.evalution(expression);
	}
}