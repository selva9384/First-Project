package tamilNadu.chennai;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		ElectricityBill o = new ElectricityBill();
		o.electricity();
	}

	private void electricity() {
		System.out.println("How many units of electricity did you spend");
		Scanner sc=new Scanner(System.in);	
		float duty=0,energy_charges=0,unit=sc.nextInt(),fixed_charges=0;
		sc.close();
		if(unit<101)
		{
			System.out.println("You don't need to pay any charges");
		}
		else if(unit>100 && unit<=200)
		{
			energy_charges=unit-100;
			duty=18;
			fixed_charges=20;
			System.out.println("Your electricity fees is "+(energy_charges*1.5+duty+fixed_charges));
		}
		else if(unit>200 && unit<=500)
		{
			unit-=200;
			energy_charges=(100*2)+(unit*3);
			duty=48;
			fixed_charges=30;
			System.out.println("Your electricity bill is "+(energy_charges+duty+fixed_charges));
		}
		else if(unit>500)
		{
			unit-=500;
			energy_charges=(float) ((unit*6.6)+(100*3.5)+(300*4.6));
			duty=167.2f;
			fixed_charges=50;
			System.out.println("your electricity bill is "+(energy_charges+duty+fixed_charges));
		}
	}

}
