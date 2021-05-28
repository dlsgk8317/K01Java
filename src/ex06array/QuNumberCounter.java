package ex06array;

/*
문제1) 파일명 : QuNumberCounter.java
다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 저장되어 있다. 배열 전체의 데이터를 읽어서 각 정수가 몇개씩 있는지 카운트하여 counter 배열에 순서대로 저장하시오.

1. answer 1-4까지 여러개 정수 배열 초기화
2. 배열 전체의 데이터를 읽기
3. 각 정수가 몇개씩 있는지 카운트 
4. counter 배열에 순서대로 저장하시오.

int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
int[] counter = new int[4];

counter[0] => 3
counter[1] => 2
counter[2] => 2
counter[3] => 4

 */

public class QuNumberCounter {

	public static void main(String[] args) {
		
		int[]  answer= { 1,4,4,3,1,4,4,2,1,3,2  };
		int[] counter = new int[4];
		
		int answerSize = answer.length; // 배열길이 : 11개 / { 1,4,4,3,1,4,4,2,1,3,2  } 갯수 세줌.
		
		int one = 0;
		int tow = 0;
		int three = 0;
		int four = 0;

		for(int a = 0; a < answer.length; a++) {
			int target =  answer[a];
			if(target == 1) {
//				one ++;
				one += 1;
			}
			else if(target == 2) {
				tow += 1;
			}
			else if(target == 3) {
				three += 1;
			}
			else if(target == 4) {
				four += 1;
			}
		}
		
//		System.out.println(one);
//		System.out.println(tow);
//		System.out.println(three);
//		System.out.println(four);
//		
		counter[0] = one;
		counter[1] = tow;
		counter[2] = three;
		counter[3] = four;
		
//		System.out.println("counter[0] =>" + counter[0]);
//		System.out.println("counter[1] =>" + counter[1]);
//		System.out.println("counter[2] =>" + counter[2]);
//		System.out.println("counter[3] =>" + counter[3]);
		
		for(int i =0; i < counter.length; i++) {
			System.out.println("counter["+i+"] =>" + counter[i]);
		}
		
//		counter[0] => 3
//				counter[1] => 2
//				counter[2] => 2
//				counter[3] => 4
//		
		
//		int i = 5;
//		int j = 6;				
//		i = j;
//		j = i;
//		one = counter.length;
		
//		System.out.println(answer[one]);
		
//		
//		int[]  answer= {11,12,15,13,55};
//		
//		System.out.println(answer[3]);
		
		
		
		
		
	}

}
