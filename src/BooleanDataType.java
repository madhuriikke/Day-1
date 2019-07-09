
public class BooleanDataType {

	public static void main(String[] args) {
		boolean b=true;
		/*System.out.println(10>20);
		
		//int first_no=10;
		//int seco_no=30;
		int first_no=20;
		int sec_no=20;
		boolean result=first_no>sec_no;
		System.out.println(result);
		if(first_no>sec_no);
		{
			System.out.println("First no is greater "+first_no);
		}
		else if(sec_no>first_no);
		{
			System.out.println("Second no.is greater "+sec_no);
		}
		else
		{
			System.out.println("Both no are equal");
		}
		*/
		
		System.out.println();
		
		int first_no=10;
		int seco_no=20;
		int third_no=30;
		int sec_no=20;
		boolean result=first_no>sec_no;
		System.out.println(result);
		if(first_no>sec_no && first_no>third_no)
		{
			System.out.println("First no is greater ");
		}
		else if(sec_no>first_no && sec_no>third_no)
		{
			System.out.println("Second no.is greter "+sec_no);
		}
		else if(third_no>first_no && third_no>sec_no)
		{
			System.out.println("thired no is greater");
		}
		else
			System.out.println("All no.s are equal");
		}
		}	
	

