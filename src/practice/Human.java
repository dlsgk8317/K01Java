package practice;

public class Human {

	String name;
	int age;
	int energy;
	
	void walk() {
		energy--;
		if(energy<0) {
			energy = 0;
			System.out.println("[walk]에너지는 0이 최소입니다.");
			System.out.println("0으로 고정됩니다.");
		}
		else {
			System.out.println("[walk]에너지가 1 감소하였습니다.");
		}
	}
	void think() {
		energy -= 2;
		if(energy<0) {
			System.out.println("[thingk]에너지는 0이 최소입니다.");
			System.out.println("0으로 고정됩니다.");
		}
		else {
			System.out.println("[thingk]에너지가 2로 감소하였습니다.");
		}
	}
	
	void eat( ) {
		energy += 2;
		if(energy>10) {
			energy = 10;
			System.out.println("[eat]에너지는 10이" + "최대치입니다.");
		}
		else {
			System.out.println("[eat]에너지가 2 증가였습니다.");
		}
	}
	
	void showState() {
		System.out.println("===님의 현재상태는 ====");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("에너지 : " + energy);
		System.out.println("========================");
	}
}
