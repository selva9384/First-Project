//program to compare to strings
import java.util.Scanner;

public class Compare_two_strings{
	public static void main(String[] args) {
	
		System.out.println("Enter two string values");
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		if(compare(str1 , str2))
		{
			System.out.println("Both are same");
		}
		else
			System.out.println("Both are not same");
	}

	private static boolean compare(String str1 , String str2) {//this method returns true if both are same otherwise it returns false 
		if(str1.length() != str2.length())
			return false;
		boolean compare=true;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
				compare=false;
		}
		return compare;
	}
	
}
