package tamilNadu.chennai;

public class Fibnacci {

	public static void main(String[] args) {
		Fibnacci o=new Fibnacci();
		o.fibo();
	}

	private void fibo() {
		int f=-1,s=1,t=0;
		while(t<13)
		{
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
		}
	}

}
