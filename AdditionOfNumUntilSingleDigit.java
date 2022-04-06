//program to find addition of a digit untill it becomes single digit
import java.util.Scanner;

public class AdditionOfNumUntilSingleDigit {

	public static void main(String[] args) {
		AdditionOfNumUntilSingleDigit o=new AdditionOfNumUntilSingleDigit();
		o.additionOfNum();
	}

	private void additionOfNum() {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(); //getting input from user
		while(num>9)
		{
			int temp=num,addition=0;
			while(num>0)
			{
				addition +=num%10;//num%10 separates the last digit of a number and add it to addition
				num/=10;
			}
			num=addition;
			System.out.println("addition of "+temp+" is "+addition);
		}
		
	}
}
