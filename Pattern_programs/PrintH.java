
public class PrintH {

	public static void main(String[] args) {
		PrintH H=new PrintH();
		H.print();
	}

	private void print() {
		for(int row=1;row<=7;row++)
		{
			System.out.print("*");
			if(row==4)
			{
				for(int i=1;i<=5;i++)
					System.out.print("*");
			}
			else
			{
			for(int space=1;space<=5;space++)
			{
				System.out.print(" ");
			}
			}
			System.out.print("*");
			System.out.println();
		}
	}

}
