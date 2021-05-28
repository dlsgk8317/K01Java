package practice;

import java.util.Scanner;

public class E01If01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if(input%2 == 0) {
			if(input>=100) {
				System.out.println("짝수이면서 100이상");
			}
			else {
				System.out.println("짝수이면서 100이하");
			}
		}
		else {
			if(input >=100) {
				System.out.println("홀수이면서 100이상");
			}
			else {
				System.out.println("홀수이면서 100미만");
			}
		}
		

	}

}
