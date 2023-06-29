// Online Java Compiler
// Use this editor to write, compile and run your Java code online
  import java.util.Scanner;
class Main {
    public static void main(String[] args) {
     

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	int a[]=new int[n];
	int i,j,temp;
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();
	for(i=0;i<n-1;i++){
	 for(j=0;j<(n-1-i);j++){
	     if(a[j]>a[j+1]){
	         temp=a[j];
	         a[j]=a[j+1];
	         a[j+1]=temp;
	     }
	 }
	}
	 	for(i=0;i<n;i++)
	 System.out.println(a[i]);
System.out.println("enter the target");
int target=sc.nextInt();
int left=0;
int right=a.length-1;
int mid=-1;
int flag=0;
while(left<=right){
    mid=(left+right)/2;
    if(target==a[mid]){
        flag=1;
        break;
    }
    else if(target>a[mid]){
        left=mid+1;
    }
    else{
        right=mid-1;
    }
}
if(flag==1){
System.out.println("found at"+ mid);
}
else{
System.out.println("do not found");
}
	}
}
