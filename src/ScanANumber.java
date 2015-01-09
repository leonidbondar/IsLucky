import java.util.Scanner;


public class ScanANumber {
	public static int scanANumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Submit lucky number...");
		int userInput = 0;
		try {
			userInput = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("not this time");
			e.printStackTrace();
		}
		scanner.close();
		return userInput;
	}

}
