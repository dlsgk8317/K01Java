package ex10accessmondifier;

//과일판매자를 추상화한 클래스
class FruitSeller {

	// 외부에서 접근할 수 없도록 private으로 선언한다.
	private int numOfApple; // 판매자의 사과 보유갯수
	private int myMoney; // 판매수익
	private final int APPLE_PRICE; // 사과의 단가

	public FruitSeller(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}

	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}

	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:" + numOfApple);
		System.out.println("[판매자]판매수익:" + myMoney);
	}
}

class FruitBuyer {

	private int myMoney; // 보유금액
	private int numOfApple; // 구매한 사과의 갯수

	public FruitBuyer(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}

	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:" + myMoney);
		System.out.println("[구매자]사과갯수:" + numOfApple);
	}
}

public class E03InfomationHiding {

	public static void main(String[] args) {

		FruitSeller seller1 = new FruitSeller(0, 100, 1000);
		
		FruitSeller seller2 = new FruitSeller(0, 80, 500);
		
		FruitBuyer buyer = new FruitBuyer(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		
		/*
		아래의 코드는 문법적으로는 오류가 없으나 지불금액과 구매한
		사과의 관계가 전혀 맞지 않는 논리적 오류가 발생되었다.
		즉, 코드(메소드)로 구현한 규칙이 완전히 무너지게 된다ㅣ.
		객체지향 프로그래밍에서는 이런 오류를 막기위해 멤버변수에 대한
		"정보은닉"을 하도록 규정하고 있다.
		 */
		
		
//		seller1.myMoney += 1000; //판매자1에게 1000원을 지불하고
//		seller1.numOfApple -= 50;//사과 50개를 구매한다.
//		buyer.numOfApple += 50; //구매자는 50개가 증가하였다.
//		
//		seller2.myMoney +=1000; // 판매자2에서 1000원을 지불하고
//		seller1.numOfApple -= 70;//사과 70개를 구매한다.
//		buyer.numOfApple += 70;//따라서 구매자는 70개가 증가하였다.
//								// 하지만 구매자의 보유금액은 차감되지 않았다.
		
		/*
		멤버변수를 private으로 선언하면 클래스 외부에서는 접근이 
		불가능하므로 아래 코드는 모두 에러가 발생된다.
		즉, 멤버변수의 정보은닉을 통해 비정상적인 접근을 차단하고,
		멤버메소드를 통해서만 구매가 이루어질수있도록 구현한다.
		 */
		
		System.out.println("구매 행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		

	}

}
