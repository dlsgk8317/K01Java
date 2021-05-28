package practice;


class Mystatic {
	
	int instanceVar;
	static int StaticVar;
	
	void instanceMethod() {
		System.out.println("instanceVar=" + instanceVar);
		System.out.println("staticVar=" + StaticVar);
		staticMethod();
	}
	
	static void staticMethod() {
//		System.out.println("instanceVar=" + instanceVar);
		System.out.println("instaticVar=" + StaticVar);
//		instanceMethod();
	}
}
public class E01StaticModifier01 {

	public static void main(String[] args) {
		
		Mystatic myStatic = new Mystatic();
		myStatic.instanceVar = 100;
		System.out.println("myStatic.instanceVar=" + myStatic.instanceVar);
		
		Mystatic.StaticVar = 200;
		System.out.println("MyStatic.stativbar=" + Mystatic.StaticVar);
		
		myStatic.StaticVar = 300;
		System.out.println("myStati.staticVar=" + myStatic.StaticVar);
		
		Mystatic ms1 = new Mystatic();
		Mystatic ms2 = new Mystatic();
		
		ms1.instanceVar = 100;
		ms2.instanceVar = 1000;
		
		System.out.println("ms1.instanceVar=" + ms1.instanceVar);
		System.out.println("ms2.instanceVar=" + ms2.instanceVar);
		
		ms1.StaticVar = 800;
		ms2.StaticVar = 900;
		System.out.println("ms1.instanceVar=" + ms1.StaticVar);
		System.out.println("ms1.instanceVar=" + ms2.StaticVar);
		
		myStatic.instanceMethod();
		myStatic.staticMethod();
		
		Mystatic.staticMethod();
	

	}

}
