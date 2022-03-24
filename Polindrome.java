package tamilNadu.chennai;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		Polindrome o=new Polindrome();
		o.polindrome();
	}

	private void polindrome() {
		System.out.println("Enter a number to find it is polindrome or not");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt(),reverse=0,temp=number;
		while(number>0)
		{
			reverse=(reverse*10)+number%10;
			number/=10;
		}
		if(temp==reverse)
		{
			System.out.println("It is a polindrome");
		}
		else
		{
			System.out.println("It is not a polindrome");
		}
	}

}
