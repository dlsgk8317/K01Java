package practice;


	class Person{
		
		String name = "정우성";
		int age = 47;
		String gender = "남자";
		String job = "영화배우";
		
		void eat() {
			
			System.out.printf("%s가(이) 식사를 한다\n", name);
		}
		void sleep() {
			System.out.printf("나이가 %d인 %s가(이) 잠자고있다.\n", age, name);
		}
	}
	
	public class E01personMain {
		
		public static void main(String[] ages) {
			
			Person person = new Person();
			
			person.eat();
			person.sleep();
			
			new Person().eat();
			new Person().sleep();
		}

	
}
