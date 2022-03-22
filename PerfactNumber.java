package tamilNadu.chennai;

import java.util.Scanner;

public class PerfactNumber {

	public static void main(String[] args) {
		PerfactNumber obj=new PerfactNumber();
		obj.perfactNumber();
	}

	private void perfactNumber() {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt(),i=1,sum=0;
		sc.close();
		while(i<number)
		{
			if((number%i)==0)
			{
				sum+=i;
			}
			i++;
		}
		if(number==sum) {
			System.out.println(number+" is a perfect number");
		}
		else {
			System.out.println(number+" is not a perfect number");
		}
	}

}
