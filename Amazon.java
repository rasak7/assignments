package week3.day1;

public class Amazon extends canaraBank {

	public static void main(String[] args) {
		Amazon A = new Amazon();
		A.cashOnDelivery();
		A.cardPyments();
		A.upipayments();
		A.internetBanking();
		A.recordPayments();

	}
	public void cashOnDelivery(){
		System.out.println("cashOndelivery Available");
	}
	
	public void upipayments(){
		System.out.println("upiPayments");
	}
	public void cardPyments() {
		System.out.println("cardPayments");
		
	}
	public void internetBanking() {
		System.out.println("InternetBanking");
		
	}

}
