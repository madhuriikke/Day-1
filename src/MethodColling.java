
public class MethodColling {
	//Static component-->can not given a call to non-static component
	                    //directly (we need to create an object of a class)
	//Static-->static(can given direct call)
	//non-static-->non static as well as static(can give direct call)
	public void go() {
		System.out.println("Inside Go Method");
		go1();//call from non-static to static
		go3();//call from non-static to static
	
	}
	public void go1() {
		System.out.println("Inside Go1 Method");
		go2();
	}
	public void go2() {
		System.out.println("Inside Go2 Method");
	}
	public static void go3() {
		System.out.println("Inside Go3 Method");
	}
	
	public static void main(String[] args) {
		MethodColling n=new MethodColling();
		//n.go1();
		//n.go2();
		go3();
	}
		
	}
	
