import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		SpyNumber sn=new SpyNumber();
		sn.spynum();

	}

	private void spynum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt(),add=0,mul=1;
		for(;num>0;num/=10)
		{
			int rem=num%10;
			add+=rem;
			mul*=rem;
		}
		if(add==mul)
		{
			System.out.println("It is a Spy number");
		}
		else
		{
			System.out.println("It is not a Spy number");
		}
	}

}
