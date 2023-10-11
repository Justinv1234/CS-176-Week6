import java.util.Scanner;

public class Week6P1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input your name: ");
			String name = in.nextLine();
		
		in.close();
		while (true) {
			System.out.println(name);
		}
	}
}
