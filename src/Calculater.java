
public class Calculater {
		/* 
		public void add(int a,int b) {
 		System.out.println("addition of two numbers"+(a+b));
		}
		public void sub(int a ,int b){
		System.out.println("supraction of two numbers"+(a-b));
		}
		
		public void multi(int a, int b){
		System.out.println("multiplication of two nimbers"+(a*b));
		}
		
		public void div(int a, int b){
			System.out.println("Divsion of two numbers"+(a/b));
			}
	
		 */
	
		public int add(int a ,int b){
			System.out.println("Addition of two numbers");
			return(a+b);
	}
		
		public int sub(int a ,int b){
		System.out.println("supraction of two numbers");
		return(a-b);
		}
		
		public int multi(int a, int b){
		System.out.println("multiplication of two nimbers");
		return(a*b);
		}
		
		public int div(int a, int b){
			System.out.println("Divsion of two numbers");
	   return(a/b);
			}
		
	public static void main(String[] args) {
	
	/*
Calculater i=new Calculater();
i.add(5,5);
i.sub(4,5);
i.multi(2,2);
i.div(2,4);
*/


Calculater i=new Calculater();
int a, b, c, d ;
a=i.add(10,5);
System.out.println("Addition="+a);
b=i.sub(5,2);
System.out.println("subtraction="+b);
c=i.multi(4,4);
System.out.println("multiplection="+c);
d=i.div(5,10);
System.out.println("division="+d);




}

	}
