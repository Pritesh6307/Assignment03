package assignmentThree;

public class MultilevelInheritance0007 extends MultilevelInheritance007 {
	public void C() {
		System.out.println("This is C");
	}

	public static void main(String[] args) {
		MultilevelInheritance0007 obj = new MultilevelInheritance0007();
		obj.A();
		obj.B();
		obj.C();

	}

}
