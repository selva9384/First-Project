
public class Pattern1 {

	public static void main(String[] args) {
		pattern();
	}

	private static void pattern() {
		int no=9;
		for(int col=1;col<=4;col++)
		{
			for(int row=1;row<=col;row++)
			{
				System.out.print(no--+" ");
			}
			System.out.println();
		}
	}

}
