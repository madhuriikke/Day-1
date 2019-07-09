
public class BreakAndContiune {
//Scope of break is within the loop only 
//Continue->Is used to skip iterations(Continue)
	public void go() {
		System.out.println("First");
		//break;
		System.out.println("Last");
	}
  public static void main(String[] args) {
	   //BreakAndContiune b=new BreakAndContiune();
	  //b.go();
	  
	 for(int i=0;i<10;i++)
	  {
		  if(i==5)
			  break;
		  System.out.println(i);
	  
	 
	  
	/*  for(int i=0;i<10;i++) {
		  if(i>=5 && i<=7)
		 // if(i>=0)
			  continue;
	  System.out.println(i);
  }
  System.out.println("Outside the loop");
  }
  */

}

}
}