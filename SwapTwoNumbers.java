package tamilNadu.chennai;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		SwapTwoNumbers obj=new SwapTwoNumbers();
		obj.swapTwoNumbers();
	}

	private void swapTwoNumbers() {
		int number1=5,number2=10;
		number1+=number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("Number 1 is "+number1);
		System.out.println("Number 2 is "+number2);
	}

}
