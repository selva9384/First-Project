package tamilNadu.chennai;

import java.util.Scanner;

public class GreatestCommonDevisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreatestCommonDevisor o=new GreatestCommonDevisor();
		o.great();
	}

	private void great() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt(),num2=sc.nextInt(),i=1,greatest=0;
		while(i<num1 && i<num2)
		{
			if(num1%i==0 && num2%i==0)
			{
				greatest=i;
			}
			i++;
		}
		System.out.println(greatest+" is the greatest common devisor of "+num1+" and "+num2);
	}
	

}
