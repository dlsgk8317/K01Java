package bokang.sub;

/*
체크카드 클래스 Ver.03
   : initMembers 초기화 메소드는 삭제처리  o
   
   1.충전은 10000원 단위로만 가능하다.
   만약 5000원을 충전하면 충전불능으로 처리한다. o
   
   2.잔고가 부족하면 결제불능으로 처리해야 한다. o
   
   3.카드번호 생성시 0으로 시작할수 없고 전체자리수는 16자리여야
   한다.
   
   4.생성자 오버로딩 처리
      new CheckCard3(카드번호, 소유자, 잔고, 포인트);
      new CheckCard3(카드번호, 소유자, 잔고); => 포인트 0으로 초기화 o
      new CheckCard3(카드번호, 소유자); => 잔고, 포인트 0으로 초기화 o
   
   5.포인트 적립율 변경
      10만원 이하결재 : 0.1%적립 -> o
      10만원 초과결재 : 0.3%적립 -> o
 */


public class CherkCard3 {
   
   
   private long cardNumber;  //카드번호
   private String owner; // 소유주
   private int balance; // 잔액
   private int point; // 포인트



   
   public long getCardNumber() {
//      3.카드번호 생성시 0으로 시작할수 없고 전체자리수는 16자리여야 한다.
      
      return cardNumber;
   }


   public void setCardNumber(long cardNumber) {
      
      this.cardNumber = cardNumber;
   }


   public String getOwner() {
      return owner;
   }


   public void setOwner(String owner) {
      this.owner = owner;
   }


   public int getBalance() {
      return balance;
   }


   public void setBalance(int balance) {
      this.balance = balance;
   }


   public int getPoint() {
      return point;
   }


   public void setPoint(int point) {
      this.point = point;
   }

	public CherkCard3() {
	}

	/*
	public CherkCard3(long cardNumber, String owner, int balance, int point) {
		if (cardNumber <= 1000_0000_0000_0000L) {
			System.out.println("카드번호 생성시 0으로 시작할수없습니다.");
		} else if (cardNumber >= 1000_0000_0000_0000_0L) {
			System.out.println("카드번호를 16자리 입력해주세요");
		} else {
			this.cardNumber = cardNumber;
		}
		this.owner = owner;
		this.balance = balance;
		this.point = point;
	}
	*/
	
	//카드번호가 정상인지 확인하기 위하 메소드
	   public boolean cardNumberRange(long cn) {
		   //정수의 범위내에서 16자리는 이와같이 표현할수 있다. 
		   if(cn>=1000_0000_0000_0000L && cn<=9999_9999_9999_9999L) {
			return true;
		   }
		   else {
			   return false;
		   }
	   }
	
	   
	   
   public CherkCard3(long cardNumber, String owner, int balance, int point) {
//      new CheckCard3(카드번호, 소유자, 잔고); => 포인트 0으로 초기화 o
      if(cardNumberRange(cardNumber)==false) {
    	  System.out.println();
    	  return; //생성자에서 return은 사용할수 있고, 실행만 종료된다.
      }
      /*
      카드번호에 오류가 있어 return이 실행되면 아래 문장이 
      실행되지 않으므로, 초기화값이 없는 빈 객체가 생성되게된다.
      */
	  this.cardNumber = cardNumber;
      this.owner = owner;
      this.balance = balance;
      this.point = 0;
   }
   public CherkCard3(long cardNumber, String owner, int balance) {
//      new CheckCard3(카드번호, 소유자, 잔고); => 포인트 0으로 초기화 o
	    if(cardNumberRange(cardNumber)==false) {
	    	System.out.println();
	    	return; //생성자에서 return은 사용할수 있고, 실행만 종료된다.
	}	   
	   this.cardNumber = cardNumber;
	   this.owner = owner;
	   this.balance = balance;
	   this.point = 0;
   }
   
   public CherkCard3(long cardNumber, String owner) {
	    if(cardNumberRange(cardNumber)==false) {
	         System.out.println();
	    	return; //생성자에서 return은 사용할수 있고, 실행만 종료된다.
	}
//      new CheckCard3(카드번호, 소유자); => 잔고, 포인트 0으로 초기화 o
      this.cardNumber = cardNumber;
      this.owner = owner;
      this.balance = 0;
      this.point = 0;
   }

   public void charge(int amount) { // 충전(입금)
//      1.충전은 10000원 단위로만 가능하다.
//      만약 5000원을 충전하면 충전불능으로 처리한다.
      if(amount == 10000) { //만약 충전받은값이 만원일경우 만원을 충전해준다.
         this.balance += amount;
//         System.out.println("입력받은 값이 만원일떼");
      }
      else if(amount%10000 == 0) { //만약 충전받은 값이 만원의 배수일경우 충전해준   다. 크거나 같을때까지
         this.balance += amount;
//         System.out.println("입력받은값이 amount%10000 == 0");
      }
      else {
         System.out.println("충전이불가능합니다.");
      }
//      this.balance += amount;
   }
 
   
  /* public void payment(int amount) { // 결제
      if(this.balance >= amount) {
         this.balance -= amount;
         savingPoint(amount);         
      }
      else {
         System.out.println("잔고가부족합니다.");
      }
   }
*/
   public void payment(int amount) {
	   
	   //잔고가 결제금액보다 크거나 같으면 정상결제됨
	   if(this.balance >= amount) {
		   //잔고에 결제할 금액만큼 차감한다.
		   this.balance -= amount;
		   //카드를 사용할떄 적립금이 발생되므로 여기서 호출한다.
		   savingPoint(amount);
	   }
	   else {
		   System.out.printf("%님 잔고가부족합니다.", owner);
	   }
   }
   /*public void savingPoint(int amount) { // 적립 : 사용금액의 0.1%를 적립해야된다.
   
//      10만원 이하결재 : 0.1%적립
//      10만원 초과결재 : 0.3%적립

      if(amount < 100000) {
         double plusPointdown = (amount*0.1);
         this.point += plusPointdown;         
      }
      else if(amount >= 100000 ) {         
      double plusPointup = (amount*0.3);
      this.point += plusPointup;
      }
   }
   */
   public void savingPoint(int amount) {
	   double plusPoint = 0;
	   /*
	    좁은 지역에서 생성한 변수는 넓은 지역에서 사용할수 없다
	    넓은 지역에서 생상한 변수는 좁은 지역에서 사용할수 있다. 
	    지역변수는 해당 지역을 벗아나면 메모리에서 소멸된다.
	   */
	   if(amount>100000) {
		   plusPoint = (amount*0.3);   
	   }
	   else {
		   plusPoint = (amount*0.1);   
	   }
	   
	   this.point += plusPoint;
   }
   

   public void showState() {
      System.out.println("카드번호:" + this.cardNumber);
      System.out.println("소유자:" + this.owner);
      System.out.println("잔고:" + this.balance);
      System.out.println("포인트:" + this.point);
      
   }
   

}


