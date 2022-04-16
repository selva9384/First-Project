
public class Duplicates_elements_in_array {

	public static void main(String[] args) {
		int[] arr= {1,3,4,5,6,45,47,66,2,3,4,1};
		System.out.println("Duplicate elements in given array are");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}

}
