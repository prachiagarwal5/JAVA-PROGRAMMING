
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ar[]={11,24,37,49,50,67,72,81,97,104};
	int target=81;
	int left=0;
	int right=ar.length-1;
	int flag=0;
	int mid;
	while(left<=right){
	mid=(left+right)/2;
	    if(ar[mid]==target){
	        flag=1;
	        break;
	    }
	    else if(ar[mid]<target){
	        left=mid+1;
	    }
	    else{
	        right=mid-1;
	    }
	}
	if(flag==1){
	    System.out.println("found at"+mid);
	}
	else{
	    System.out.println("not found");
	}
	}
}
