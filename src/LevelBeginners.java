import java.util.*;
public class LevelBeginners {

	public static void main(String[] args)
	{
		Scanner se =new Scanner (System.in);
		System.out.println("Enter String");
		String str =se.next();
		//String levelBeginners = new String( "levelBeginners" );
		switch (str) {
		case "Beginners":
			System.out.println("Your levle is one");
			break;
		case "Intermidate":
			System.out.println("Your levle is Tow");
			break;
		case "Expert":
			System.out.println("Your levle is Three");
			break;
	    default :
				System.out.println("Your level is 3");
			
		
		
		
		}	

	}

}
