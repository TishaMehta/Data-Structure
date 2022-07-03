import java.util.Scanner;
public class Add_two_matrix{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entre number of rows:");
		int r=sc.nextInt();
		System.out.println("entre number of cplumns:");
		int c=sc.nextInt();
		int a1[][]=new int[r][c];

		int a2[][]=new int[r][c];
		int additionArray[][]=new int[r][c];
	
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print("A"+i+j);
				a1[i][j]=sc.nextInt();
			}
			//System.out.println(" ");//
		}

		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print("B"+i+j);
				a2[i][j]=sc.nextInt();
			}
			//System.out.println("");//
		}
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				additionArray[i][j]=a1[i][j]+a2[i][j];
			}
			System.out.println("");
	}
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
			System.out.print("\t"+additionArray[i][j]+"\t");
		}
		System.out.println("");
	}

	
	}
}
