import java.util.Scanner;
class Method_Implement{
	  int s[]=new int[10];
		 int top=-1;
		 Scanner sc=new Scanner(System.in);
	public void push(int x){
		if(top>=10){
			System.out.println("stack overrflow");
		}
		else{
			top=top+1;
			s[top]=x;
		}
	}
	public int pop(){
		if(top<0){
			System.out.println("stack underflow");
			return 0;
		}
		else{
			top=top-1;
			return s[top];
		}
	}
	public int peep(int i1){
		if(top-i1+1<0){
			System.out.println("stack underflow");
			return 0;
		}
		else{
			return s[top-i1+1];
		}
	}
	public void change(int i2, int x){
		if(top-i2+1<0){
			System.out.println("stack underflow");
		}
		else{
			s[top-i2+1]=x;
		}
	}
	public void display(){
		
		if(top<0){
			System.out.println("stack underflow");
		}
		else{
			int temp=top;
			while(temp!=-1){
				System.out.println(s[temp]);
				temp=temp-1;
			}
		}
	}
}
class Lab4_1{
	public static void main(String[] args) {
		Method_Implement t = new Method_Implement();
		Scanner sc= new Scanner(System.in);
		boolean flag=true;
		while(flag){
			int y=sc.nextInt();
			switch(y){
				System.out.println("opertaion")
			case 1:
				System.out.println("entre element");
				t.push(sc.nextInt());
				break;
			case 2:
				System.out .println("remove last element:"+t.pop());
				break;
			case 3:
				int i1=sc.nextInt();
				System.out.println(i1+"element from top of the stack is "+t.peep(i1));
				break;
			case 4:
				int i2=sc.nextInt();
				System.out.println("new element:");
				int x=sc.nextInt();
				t.change(i2,x);
				break;
			case 5:
				t.display();
			case 6:
				flag= false;
				break;
		}
		}
	}
}
