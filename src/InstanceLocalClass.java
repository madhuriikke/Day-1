public class InstanceLocalClass {
	//Static i=10;//Class variable
	int i=10;//instance variable/Global variable-->scope is within class
	
	public void go() {
		//i=786;
		int j=456;//local variable-->Scope is within method only
	}
	public void show() {
		//i=498;
		int k=78;
	}
	public static void main(String[] args) {
	}
}
