
public class PrintM {

	public static void main(String[] args) {
		print();
	}

	private static void print() {
		for(int row=1;row<=10;row++)
		{
			System.out.print("*");
			for(int j=1;j<=row;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int k=row;k<10;k++)
			{
				System.out.print("  ");
			}
			System.out.print("*");
			for(int j=1;j<=row;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
	}

}
