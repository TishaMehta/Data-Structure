import java.util.Scanner;
class CircularQUeue{
    int s[]=new int[5];
    int front=-1,r=-1;
    int n;
    public void Enqueue(int n){
        if(r==n){
            r=0;
            if(front==0){
                System.out.println("overflow");
            }
            else{
                s[r]=n;
            }
        }
        if(front==r && front!=0 && front!=-1){
            System.out.println("overflow");
        }
        else{
            r++;
            s[r]=n;
            if(front==-1){
                front=0;
            }
        }
    }
    public int Dequeue(){
        if(front==-1){
            System.out.println("underflow");
        }
        n=s[front];
        if(front==n){
            front=0;
        }
        else{
            front++;
        }
        return n;
        
    }
    public void Display(){
        if(front==-1){
            System.out.println("underflow");
        }
        else{
            for(int i=front;i<=r;i++){
                System.out.println(s[i]);
            }
        }
    }
}
public class Lab7_2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CircularQUeue cq=new CircularQUeue();
        boolean flag=true;
        while(flag){
            int x=sc.nextInt();
            switch(x){
                case 1:
                    System.out.println("entre element for enqueue:");
                    cq.Enqueue(sc.nextInt());
                    break;
                case 2:
                    System.out.println("delete element:"+cq.Dequeue());
                    
                    break;
                case 3:
                    System.out.println("Display element:");
                    cq.Display();
                    break;
                case 4:
                    flag=false;
            }
        }
    }
}