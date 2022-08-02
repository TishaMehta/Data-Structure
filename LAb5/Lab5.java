import java.util.Scanner;
class RevPol{
	static char s[]=new char[100];
	static int top=-1;
	static int rank=0;
	static int ipf,spf,r;
	static char next,temp,c,a;
	static String polish="";
	public static int ipf(char c){
		if(c=='+'||c=='-'){
			ipf=1;
		}
		else if(c=='*'||c=='/'){
			ipf=3;
		}
		else if(c=='^'){
			ipf=6;
		}
		else if(c=='('){
			ipf=9;
		}
		else if(c==')'){
			ipf=0;
		}
		else{
			ipf=7;
		}
		return ipf;
	}
	public static int spf(char c){
		if(c=='+'||c=='-'){
			spf=2;
		}
		else if(c=='*'||c=='/'){
			spf=4;
		}
		else if(c=='^'){
			spf=5;
		}
		else if(c=='('){
			spf=0;
		}
		else if(c==')'){
			spf=99;
		}
		else{
			spf=8;
		}
		return spf;
	}
	public static int findrank(char a){
		int r;
		if(a=='+'||a=='-'||a=='*'||a=='/'||a=='^'){
			r=-1;
		}
		else{
			r=1;
		}
		return r;
	}
	public static void push(char c){
		if(top>100){
			System.out.println("stack underflow");
		
		}
		else{
			top++;
			s[top]=c;
		}
	}
	public static char pop(){
		if(top<0){
			System.out.println("stack underflow");
			return 0;
		}
		else{
			a=s[top];
			top--;
			return a;
		}
	}
	public static void polishString(String str){
		for(int i=0; i<str.length();i++){
			next=str.charAt(i);
			if(next!=' '){
				if(top<0){
					System.out.println("invalid");
					break;
				}
				while(spf(s[top])>ipf(next)){
					temp=pop();
					polish=polish+temp;
					rank=rank+findrank(temp);
					if(rank<1){
						System.out.println("invalid");
						break;
					}
				}
				if(spf(s[top])!=ipf(next)){
					push(next);
				}
				else{
					pop();
				}
			}
		}
		if(top!=0 || rank!=1){
			System.out.println("invalid");
		}
		else{
			System.out.println("valid");
			System.out.println("polish string:"+polish);
		}
	}
}
class Lab5{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entre a string:");
		String str=sc.next();
		RevPol obj=new RevPol();
		obj.push('(');
		obj.polishString(str);
	}
}
