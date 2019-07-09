package PassbyvaluepassbyReference;

public class swapNumbers {
	//pass by values-->Create copy of the reference and change will be done in copied object only and not
	//in the original objects
	//change will be reflected in method or function only and not in the main method 
	
	
	// pass by reference -->change will be done in the original
	//reference and will reflect it in main method 
	
	int s;
	int t;
/*	//pass By Values
	 public static void swap(int a,int b)
	  {
	  int temp=a;
	  a=b;
	  b=temp;
	 }
	 */
	 
	public static void swap(swapNumbers p)
	{
		//pass by Reference
		int temp=p.s;
		p.s=p.t;
		p.t=temp;
	}
	
	

	public static void main(String[] args) {
		swapNumbers sw=new swapNumbers();
		sw.s=50;
		sw.t=100;
		//swap(sw.s,sw.t);
		swap(sw);
		System.out.println("Pass by values, s is: "+sw.s);
		System.out.println("Pass by values, t is: "+sw.t);


	}

}
