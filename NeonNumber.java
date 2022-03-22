package tamilNadu.chennai;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		NeonNumber obj=new NeonNumber();
		obj.neonNumber();
	}

	private void neonNumber() {
		System.out.println("Enter a number to find it is neon number or not");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt(),sqr=number*number,sum=0;
		sc.close();
		while(sqr>0)
		{
			sum=sum+sqr%10;
			sqr/=10;
		}
		if(number==sum)
		{
			System.out.println(number+" is a Neon number");
		}
		else
		{
			System.out.println(number+" is not a neon number");
		}
	}

}
