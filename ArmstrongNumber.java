package tamilNadu.chennai;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		ArmstrongNumber o=new ArmstrongNumber();
		o.armstrongNumber();
	}

	private void armstrongNumber() {
		System.out.println("Enter a number to find that is Armstrong pr not");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(),num2=0;
		int digit=digit(num),temp=num;
		while(num>0)
		{
			int rem=num%10;
			num2=(int) (num2+Math.pow(rem,digit));
			num/=10;
		}
		if(num2==temp)
		{
			System.out.println("It is a Armstrong Number");
		}
		else
		{
			System.out.println("It is not a Armstrong Number");
		}
	}

	private int digit(int num) {
		int digit=0;
		while(num>0)
		{
			num/=10;
			digit++;
		}
		return digit;
	}

}
