import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Prime p=new Prime();
		p.prime_number();
	}

	private void prime_number() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		boolean result=false;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				result=true;
			}
		}
		if(result==true)
		{
			System.out.println(num+" is not a prime number");
		}
		else
		{
			System.out.println(num+" is a prime number");
		}
	}

}
