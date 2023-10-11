import java.util.Scanner;

public class Week6P2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("what is your name?: ");
			String name = in.nextLine();
		
		System.out.print("hello " + name + ", how many exams have you taken?: ");
		int numOfExams = in.nextInt();
		int total = 0;

		for (int i = 1;i <= numOfExams;i++) {
			int num = 0;
			do {
				System.out.print("give me the score of exam "+ i +":");
				num = in.nextInt();
				if (num < 0 || num > 100) {
					System.out.print("Invalid score! Please ");
				}
				else {
					total += num;
				}
			} while (num < 0 || num > 100);
		}
		System.out.print("Hi, " + name + ", your average score of " + numOfExams + " exams is " + total/numOfExams);
		in.close();
	}
	
}
