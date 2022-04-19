//program to find a string starts with specific letters
public class Starts_with {

	public static void main(String[] args) {
		String str = "selvendiran r";
		System.out.println(startsWith(str, "selv"));
	}

	private static boolean startsWith(String str, String starting) {
		boolean start = true;
		for (int i = 0; i < starting.length(); i++) {
			if (str.charAt(i) != starting.charAt(i)) {
				start = false;
				return start;
			}
		}
		return start;
	}

}
//Output: true
