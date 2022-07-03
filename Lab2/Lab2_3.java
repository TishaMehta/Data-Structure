import java.util.Scanner;
class Lab2_3{
	public static void main(String[] args) {
		int[][]a=new int[3][2];
		int[][]b=new int[2][3];
		int[][]c=new int[3][3];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("entre 3*2 matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				a[i][j]=sc.nextInt();

			}
		}
		System.out.println("entre 2*3 matrix");
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				b[i][j]=sc.nextInt();
			}

			
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j]=a[i][0]*b[0][j]+a[i][1]*b[1][j];
				System.out.println("a multiply b matrix:"+c[i][j]);
			}
		}
	}
}