package PassbyvaluepassbyReference;

public class OneDigitAns {

	public static void main(String[] args) {
		
		int n=43256;
		int sum =0;
		int b;
		int test =n%10;
		int n1 =n/10;
		System.out.println("first N value "+test);
		System.out.println("first N1 value "+n1);
		
		while ( n != 0)
		{
			b = n % 10;
			sum= sum+b;
			n=n/10;			
		
		}
		
		System.out.println("first sum value "+sum);
		int finalSum = 0;
		while( sum != 0)
				 {
			 b= sum % 10;
			 finalSum = finalSum + b;
			 sum = sum/10;
				}
		System.out.println("first finalSum value "+finalSum);
		
		}
				

}


