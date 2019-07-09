
public class GoMethodEx {
	public void go(){
		System.out.println("Inside Go Method");
		go2();
		System.out.println("After calling Go2 Method");
	}
	public void go1(){
	System.out.println("Iside Go1 Method");
	go();
	System.out.println("After Go Method");
	}
	public void go2() {
		System.out.println("Inside Go2 Method");
	}
	public static void main(String[] args) {
		
		GoMethodEx n= new GoMethodEx();
		n.go1();
		System.out.println("After calling Go1 Method");
		
	}
}
