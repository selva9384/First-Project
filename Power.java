import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Power p=new Power();
		p.power();
	}

	private void power() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("Enter power of number");
		int pow=sc.nextInt(),result=1;
		for(int i=1;i<=pow;i++)
		{
			result*=num;
		}
		System.out.println(result);
	}

}
