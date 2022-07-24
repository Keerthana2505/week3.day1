//Assignment 3
package week3.day1.Assignment;

class BankInfo{

	public void saving() {
		System.out.println("Savings Account");
	}
	public void fixed() {
		System.out.println("Fixed Account");
	}
	public void deposit() {
		System.out.println("DEPOSIT MONEY");
	}
	
}


class AxisBank extends BankInfo{

	public void deposit() {       //Overriding deposit()
		System.out.println("Deposit Money");
	}
}


public class Overriding {

	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposit();
	}
}


