package conversion;
import java.util.Scanner;

public class BinaryToDecimal {
	
	public static int convertBTD(String binary) {
		
		int res = 0;
		for(int i=1; i<=binary.length(); i++) {
			if(binary.charAt(binary.length()-i)== '1') {
				res += Math.pow(2, i-1);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the binary value");
		String binary = scanner.nextLine();
		System.out.println(convertBTD(binary));
	}
}
