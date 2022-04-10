//program to print I pattern with *
public class PrintI {

	public static void main(String[] args) {
		PrintI I=new PrintI();
		I.print();
	}

	private void print() {
		for(int row=1;row<=7;row++)
		{
			if(row==1||row==7)
			for(int i=1;i<=5;i++)
			{
				System.out.print("* ");
			}
			else
			{
				for(int i=1;i<=4;i++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
