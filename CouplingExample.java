class Mobile{
	Os os;
	Mobile(){
		os=new Ios();  // os object is created when mobile object is created
		// this is high coupling
		System.out.println("through constructor");
	}
	void setOs(Os os) {
		this.os=os; //loose coupling
		System.out.println("through setter");
	}
	void osType() {
		System.out.println((os.getClass()));
	}
}

class Os{	} 

class Android extends Os{ }

class Ios extends Os{}

public class CouplingExample {
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.setOs(new Android());
		mobile.osType();
	}

}
