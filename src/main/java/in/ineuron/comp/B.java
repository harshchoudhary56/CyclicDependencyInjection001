package in.ineuron.comp;

public class B {

	private A a;
	static {
		System.out.println("B.class file is loading");
	}
	
	public B() {
		System.out.println("B:: 0 param constructor");
	}
	
	public B(A a) {
		this.a = a;
		System.out.println("B:: 1 param constructor");
	}
	
	public void setA(A a) {
		this.a = a;
		System.out.println("B.setA()");
	}

	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}
}
