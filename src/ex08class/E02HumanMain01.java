package ex08class;

public class E02HumanMain01 {

	public static void main(String[] args) {

		Human01 human = new Human01();
		
		human.name = "마이클";
		human.age = 28;
		human.energy = 4;
		
		human.showState();
		human.walk();
		human.thinking();
		human.eat();
		human.showState();
		
		for(int i=1; i<=20; i++) {
			human.walk();
		}
		for(int i=1; i<=20; i++) {
			human.eat();
		}
		for(int i=1; i<=20; i++) {
			human.thinking();
		}
		human.showState();
		
	}

}
