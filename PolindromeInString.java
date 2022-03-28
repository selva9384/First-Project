import java.util.Scanner;

public class PolindromeInString {

	public static void main(String[] args) {
		PolindromeInString o=new PolindromeInString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		o.polindrome(sc.next());
	}

	private void polindrome(String word) {
		int i=word.length()-1;
		String compare="";
		while(i>=0)
		{
			compare=word.charAt(i)+compare;
			i--;
		}
		if(word.equals(compare))
			System.out.println(word+" is a polindrome");
		else
			System.out.println(word+" is not a polindrome");
	}

}