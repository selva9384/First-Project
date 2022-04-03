
public class PrintR {

	public static void main(String[] args) {
		PrintR R=new PrintR();
		R.print();
	}

	private void print() {
		for(int i=1;i<=11;i++)
		{
			System.out.print("*");
			if(i==1||i==6)
			{
				for(int j=1;j<=4;j++)
				{
					System.out.print(" *");
				}
			}
			else if(i<6)
			{
				for(int k=1;k<=9;k++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			else
			{
				for(int l=1;l<=i;l++)
				{
				System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
