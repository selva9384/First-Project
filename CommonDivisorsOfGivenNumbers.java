package tamilNadu.chennai;

import java.util.Scanner;

public class CommonDivisorsOfGivenNumbers {
	public static void main(String[] args) {
		CommonDivisorsOfGivenNumbers o=new CommonDivisorsOfGivenNumbers();
		o.commonDivisor();
	}

	private void commonDivisor() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt(),num2=sc.nextInt(),i=1;
		while(i<num1 && i<num2)
		{
			if(num1%i==0 && num2%i==0)
			{
				System.out.println(i);
			}
			i++;
		}
		System.out.println("are the common divisors for given numbes");
	}
}
