//print number 3 pattern with *
public class Print3 {

	public static void main(String[] args) {
		Print3 p3=new Print3();
		p3.print();
	}

	private void print() {
		for(int row=1;row<10;row++)
		{
			if(row==1||row==9||row==5)
			{
				for(int i=1;i<=6;i++)
				{
					System.out.print(" *");
				}
			}
			else
			{
				//System.out.print("*");
				for(int i=1;i<=11;i++)
				{
					System.out.print(" ");
				}
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
