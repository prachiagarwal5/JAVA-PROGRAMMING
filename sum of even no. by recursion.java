

public class Main
{
    public static int even(int x){
        if(x==2){
            return 2;
        }
      int sum=x+even(x-2);
      return sum;
    }
	public static void main(String[] args) {
	System.out.println(even(14));
	}
}
