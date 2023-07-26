

public class Main
{
    static boolean ans=false;
    public static void Solve(int arr[],int sum,int target,int i){
        if(i>=arr.length){
           if(sum==target){
               ans=true;
           } 
           return;
        }
        Solve(arr,sum+arr[i],target,i+1);
        Solve(arr,sum,target,i+1);
          if(sum==target){
               ans=true;
           }
    }
	public static void main(String[] args) {
		int arr[]={1,2,3};
		int target=7;
		Solve(arr,0,target,0);
		if(ans==true){
		    System.out.println("the combination is found");
		 
		}
		else{
		    System.out.println("the combination is not found"); 
		}
	}
}
