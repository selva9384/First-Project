
//program to find Phone numbers from given text file
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPhoneNumbersFromGivenTextFile {

	public static void main(String[] args) {
		FindPhoneNumbersFromGivenTextFile find = new FindPhoneNumbersFromGivenTextFile();
		find.findPhoneNumber();
	}

	private void findPhoneNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path of text file which contains phone numbers");
		File inputFile = new File(sc.next());
		System.out.println("Enter the path to store the file which contains phone numbers");
		File outputFile = new File(sc.next());
		sc.close();
		FileWriter fw = null;
		try {
			fw = new FileWriter(outputFile);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		FileReader fr = null;
		try {
			fr = new FileReader(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		Pattern pattern = Pattern.compile("(0|91)?[5-9][0-9]{9}");
		String line = "";
		try {
			line = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Matcher match = null;
		int num = 1;
		while (line != null) {
			match = pattern.matcher(line);
			while (match.find()) {
				try {
					fw.write(num++ + ". " + match.group() + "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				line = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			fw.flush();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			fw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
