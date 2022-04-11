
public class PrintL {

	public static void main(String[] args) {
		PrintL L=new PrintL();
		L.print();
	}

	private void print() {
		for(int row=1;row<=6;row++)
		{
			System.out.println("*");
			if(row==6)
			{
				for(int i=1;i<=6;i++)
				{
					System.out.print("* ");
				}
			}
		}
	}

}
