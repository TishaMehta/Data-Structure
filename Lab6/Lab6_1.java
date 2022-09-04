import java.util.Scanner;
class EvaluationPostfix{
	int top=-1;
	int s[]=new int[100];
	int value=0;

	
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
	public int operation(int op2, int op1, char y){
		if(y=='+'){
			return (op1+op2);
		}
		else if(y=='-'){
			return (op1-op2);
		}
		else if(y=='*'){
			return (op1*op2);
		}
		else if(y=='/'){
			return (op1/op2);
		}
		else{
			return(op1^op2);
		}
	}
	public void evalution(String str){
		for(int i=0;i<str.length();i++){
			
			boolean flag=Character.isDigit(str.charAt(i));
			if(flag){
			push(Character.getNumericValue(str.charAt(i)));
			}
			else{
				value=operation(pop(),pop(),str.charAt(i));
				push(value);
			}
		}
		System.out.println("ans:"+value);
	}
}
public class Lab6_1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter expression:");
		String expression=sc.nextLine();
		EvaluationPostfix ep=new EvaluationPostfix();
		ep.evalution(expression);
	}
}
