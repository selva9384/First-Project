import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		BinaryToDecimal o =new BinaryToDecimal();
		o.binaryToDecimal();
	}

	private void binaryToDecimal() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Binary value");
		int num=sc.nextInt(),count=0;
		int decimal=0;
		while(num>0)
		{
			int rem=num%10;
			decimal+=rem*power(2, count);
			num/=10;
			count++;
		}
		System.out.println(decimal);
		
	}
	public int power(int num,int pow)
	{
		int i=1,result=1;
		while(i<=pow)
		{
			result*=num;
			i++;
		}
		return result;
	}

}
