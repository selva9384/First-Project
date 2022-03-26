import java.util.Scanner;

public class DecimalToBinary {

	
    public static void main(String[] args)
    {
    	  DecimalToBinary o=new DecimalToBinary();
          Scanner sc =new Scanner(System.in);
          int num=sc.nextInt();
          o.decimalToBinary(num);
    }
    private void decimalToBinary(int num)
    {
      	int binaryNumber = 0;
      	int count = 0;
    	/*while (num != 0) {
        int rem = num % 2;
        double c = Math.pow(10, count);
        binaryNumber += rem * c;
        num /= 2;
          count++;
    	}*/
    	System.out.println(binaryNumber);
}

}