
public class Pattern2 {

	public static void main(String[] args) {
		pattern();
	}

	private static void pattern() {
		int num=0;
		for(int row=5;row>=1;row--)
		{
			num=row;
			for(int col=row;col<=5;col++)
			{
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
	}

}
