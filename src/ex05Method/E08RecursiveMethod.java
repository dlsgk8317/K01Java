package ex05Method;

public class E08RecursiveMethod {
	
	static int factorial(int number) {
		int result;
		if(number==1) {
			result = 1;
		}
		else {
			result = number * factorial(number-1);
		}
		System.out.println("계산과정:number=" + number +", result=" + result);
		
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println("재귀함수를 이용한 팩토리얼 구하기");
		System.out.println("4faxtorial:"+ factorial(4));
		System.out.println("10faxtorial:"+ factorial(10));

	}

}
