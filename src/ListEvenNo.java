import java.util.Scanner;

public class ListEvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number you want");
		n=s.nextInt();
		
			System.out.println("Enter the list of even number");
			
			for(i=1;i<=n;i++)
			{
				if(i%2==0)
					
		System.out.println(i);
			}
		}
		

	}

