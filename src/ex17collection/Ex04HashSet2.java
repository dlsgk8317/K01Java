package ex17collection;

import java.util.HashSet;

import common.Person;

public class Ex04HashSet2 {

	public static void main(String[] args) {

		HashSet<Person> hashSet = new HashSet<Person>();
		/*
		두 메소드의 오버라이딩은 Person클래스를 참조하면 됨.
		기본적인 사용법은 list랑 동일하나 중복을 허용하지않으며, 순서를 지정하는 않는다는것만 다르다.
		 */
		Person p1 = new Person("정우성1", 30);
		Person p2 = new Person("정우성2", 31);
		Person p3 = new Person("정우성3", 30);
		
		hashSet.add(p1);
		hashSet.add(p2);
		boolean b = hashSet.add(p3);
		System.out.println("p3 객체 정보여부:" + b);
		
		System.out.println("HashSet에 저장된 객체수 : " + hashSet.size());
	}

}
