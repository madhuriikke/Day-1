import java.util.Scanner;

public class IFElseStatment {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int num=(int)(Math.random()*20);
		System.out.println(num);
		if(num>10)
			System.out.println(num+" is greater than 10");
		else if (num<=10 && num>=5)
			System.out.println(num+" is between 5 and 10");
		else
			System.out.println(num+" is less than 10 ");
		*/
		
		/*
		//given no is even or odd example..
		
		int i;
		Scanner s= new Scanner(System.in);
				System.out.println("Enter the number you want to check:");
		i =s.nextInt();
		
			if (i%2==0)
			{
			System.out.println(" The given number'+0+' is even");
			}
		else
		{
			System.out.println(" The given number '+0+' is odd");
		}
	*/		
		
		//Prime no
		
		int no=7;
		int temp =0;
	for(int i=7;i<no-1;i++)
	{
		if(no%i==0)
		{
			temp=temp+i;
		}

	}
	if(temp>0)
	{
		System.out.println("no is not prime");
	}
	else
	{ System.out.println("no is prime");
	
		
	}
 }

}
