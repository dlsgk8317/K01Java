package practice;

public class E02HumanMain {

	public static void main(String[] args) {
		
		Human human = new Human();
		
		human.name = "마이클";
		human.age = 28;
		human.energy = 4;
		
		human.showState();
		human.eat();
		human.walk();
		human.think();
		human.showState();
		
		for(int i =1; i<=20; i++) {
			human.walk();
		}
		human.eat();
		
		for(int i=1; i<=20; i++) {
			human.eat();
		}
		human.showState();

	}

}
