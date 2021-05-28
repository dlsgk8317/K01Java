package bokang.sub;
/*
체크카드 클래스 Ver.01

시나리오] 체크카드를 클래스로 표현해보자.
	멤버변수 : 카드번호, 소유자, 잔액, 포인트
	멤버메소드 : 충전(입금), 결제, 적립, 현재상태출력
	적립율 : 사용금액의 0.1%	
*/

public class CherkCard1 {

	public long cardNumber;
	public String owner;
	public int balance;
	public int point;

	public void charge(int amount) { // 충전(입금)
		// 현재 잔고에 충전할 금액을 더해준다.
		this.balance += amount;
	}

	public void payment(int amount) { // 결제
		// 현재 잔고에 결제할 금액만큼 차감한다.
		this.balance -= amount;
		//카드를 사용할때 적립금이 발생되므로 여기서 호출한다.
		savingPoint(amount);
	}

	public void savingPoint(int amount) { // 적립 : 사용금액의 0.1%를 적립해야된다.
	
		double plusPoint = (amount*0.1);
		
		this.point += plusPoint;
		/*
			복합대입 연산자의 특성상 형은 항상 좌측항을 따라간다. 
			따라서 형변환에 대한 에러가 발생하지 않는다.
			하지만 아래처럼 풀어서쓰면 에러가 발생한다.
		 */
//		point = point + plusPoint;
	}

	public void showState() {
		System.out.println("카드번호:" + this.cardNumber);
		System.out.println("소유자:" + this.owner);
		System.out.println("잔고:" + this.balance);
		System.out.println("포인트:" + this.point);
		
		// 현재상태출력
	}

}