package ex03operator;

public class E07BitOperator {

	public static void main(String[] args) {
		
		/*
		비트연산자 : 자료의 bite단위로 논리연산한다.
		& : 비트Aan. 좌우가 둘다 1일때만 1을 반환. 나머지는 0
		| : 비트Or. 좌우 둘중 하나만 1이면 1을 반환. 둘다0일때 0반환
		^ : 비트Eor. 둘이 같으면 0, 다르면 1을 반환.
		~ : 비트Not. 반전된 값을 반환. 0이면 1, 1이면 0을 반환
		 */
		
		int num1 = 5; // 00000000 00000000 00000000 00000101 -> 4
		int num2 = 3; // 00000000 00000000 00000000 00000011 -> 3
		int num3 = 1; // 11111111 11111111 11111111 11111111 -> -1
					  // 00000000 00000000 00000000 00000001 -> 1
		
		/*
		num3의 값이 -1인 이유는 1을 더했을떄 0이 되기 때문이다.
		양수 1을 2의 보수를 취하면 -1이 된다.
		1의보수 : 기존값을 반전
		2의보수 : 1의보수에 1을 더한 값
		 */
		
		System.out.println("비트AND:" + (num1 & num2));
		System.out.println("비트OR:" + (num1 | num2));
		System.out.println("비트XOR:" + (num1 ^ num2));
		System.out.println("비트NOT:" + (~num3));

	}

}
