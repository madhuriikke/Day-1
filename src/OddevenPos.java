
public class OddevenPos {

	public static void main(String[] args) {
		int a[]= {3,4,5,5,6,9};
		int  temp=0;
		int temp1=1;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				
			{
				temp=temp+a[i];
				//System.out.println(i);
			}
			
		}System.out.println("Additon of even index value "+temp);
			
			
	

	for(int i=0;i<a.length;i++)
	
	{
		if(i%2!=0)
			
		{
			temp1=temp1+a[i];
			//System.out.println(i);
		}
		
	}
	System.out.println("Additon of odd index value "+temp1);
		
		
			
}
	}




