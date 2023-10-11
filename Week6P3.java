import java.util.Scanner;

public class Week6P3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean isDigit = false;
		do {
			isDigit = false;
			System.out.print("Please give me a sentence: ");
			String sentence = in.nextLine();
			
	        for (int i = 0; i < sentence.length(); i++) {
	            if (Character.isDigit(sentence.charAt(i))) {
	                isDigit = true;
	                break;
	            }
	        }
	        if (isDigit) {
	        	System.out.println(sentence + " contains numerical characters, please check it again");
	        }
		} while (isDigit);
		
		System.out.println("no numerical characters");
		in.close();
	}
}
