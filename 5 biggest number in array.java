
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("enter the size of array");
    int n = sc.nextInt ();
    int[] a = new int[n];
    int i,j;
    for (i = 0; i < n; i++)
        a[i] = sc.nextInt ();

int temp=0;
for(i=0;i<(n-1);i++){
    for(j=0;j<(n-1-i);j++){
        if(a[j]>a[j+1]){
      temp=a[j];
      a[j]=a[j+1];
      a[j+1]=temp;
    }
        
    }
}
for(i=(n-1);i>(n-6);i--){
    System.out.println(a[i]);
}


  }
}
