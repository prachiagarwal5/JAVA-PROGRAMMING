import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the row size");
		int m=sc.nextInt();
		System.out.println("enter the column size");
		int n=sc.nextInt();		
		int a[][]=new int[m][n];
		int i,j;
		int total_size=m*n;
		int size=0;
		for(i=0;i<m;i++){
		    for(j=0;j<n;j++){
		        a[i][j]=sc.nextInt();
		        if(a[i][j]==0){
		            size++;
		        }
		    }
		}
		if((total_size/size)>0.5 || (total_size/size)==0.5 ){
		    System.out.println("it is a sparse matrix");
		}
		else{
		    System.out.println("it is not a sparse matrix");
		}

	}
}
