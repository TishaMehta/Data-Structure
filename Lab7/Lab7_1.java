import java.util.Scanner;
class Queue{
	int s[]=new int[5];
	int f=-1;
	int r=-1;
	int n;
	public void enqueue(int n){
		if(r>=4){
			System.out.println("Queue overflow");
		}
		else{
			r=r+1;
			s[r]=n;
			if(f==-1){
				f=0;
			}
		}
	}
	public int dequeue(){
		if(f==-1){
			System.out.println("Queue underflow");
			return 0;
		}
		else{
			n=s[f];
			if(f==r){
				f=-1;
				r=-1;

			}
			else{
				f++;

			}
			System.out.println(n);
				return n;
				
			}
		}
	public void display(){
			if(f==-1){
				System.out.println("queue underflow");

			}
			else{
				for(int i=f;i<=r;i++){
					System.out.println(s[i]);
				}
			}
		}
	}

public class Lab7_1{
	public static void main(String[] args) {
		
		Queue obj=new Queue();
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
	while(flag){
		int w=sc.nextInt();
			switch(w){
				
				case 1:
				System.out.println("insert element:");
				obj.enqueue(sc.nextInt());
				break;
				case 2:
				System.out.println("delete element:");
				obj.dequeue();
				break;
				case 3:
				System.out.println("display element:");
				obj.display();
				break;
				case 4:
				flag=false;
		
}
			}
		}
	}















































































































































