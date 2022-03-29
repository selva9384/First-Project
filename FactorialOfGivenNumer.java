import java.util.Scanner;

public class FactorialOfGivenNumer {

	public static void main(String[] args) {
		FactorialOfGivenNumer fac=new FactorialOfGivenNumer();
		fac.factorial();

	}

	private void factorial() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt(),factorial=1;//getting input from user
		for(;num>0;num--)
		{
			factorial*=num; //calculating factorial
		}
		System.out.println("Factorial is "+factorial);//printing factorial
	}

}
