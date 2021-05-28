package practice;

public class E01If02 {

	public static void main(String[] args) {

//	시나리오] 국,영,수 점수의 평균값을 구하여 학점을 출력하는 프로그램을 작성하시오. // 국영수의 점수는 임의의값으로 입력하시오.
//	90점 이상은 A학점, 60점 미만은 F학점으로 판단하여 출력합니다.
	
		int kor = 90;
		int eng = 45;
		int math = 5;
		
		double total = (kor+eng+math)/3;
		
		if(total<=100 && total>=90) {
			System.out.println("A학점" + total);
		}
		else if(total<=89 && total>=80) {
				System.out.println("b학점" + total);
			}
			else if(total<=79 && total>=70) {
				System.out.println("c학점" + total);
			}
			else if(total<=69 && total>=60) {
				System.out.println("d학점" + total);
			}
			else {
				System.out.println("f학점" + total);
			}
	}
}


