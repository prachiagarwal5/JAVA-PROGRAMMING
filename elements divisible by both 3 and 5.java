//code for elements divisible by both 3 and 5
public class Main
{
	public static void main(String[] args) {
	 int i;
		int [] num = new int[100];
		for( i=0;i<100;i++){
		    num[i]=i;
		}
		System.out.print("the elements divisible by both 3 and 5 are ");
		for( i=0;i<100;i++){
		    if(num[i]%3==0 & num[i]%5==0){
		System.out.println(i);
		}
		}
}
}
