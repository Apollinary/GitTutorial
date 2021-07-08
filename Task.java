package at;

public class Task {

	public static void main(String args[]) {
		System.out.println("This line added into somefix.");
		System.out.println("This line added into new_branch.");
		System.out.println("Another line edited into somefix.");
		System.out.println("This line is added in branch somefix after merge.");

		int firstNumber = Integer.valueOf(args[0]);
		int sn = Integer.valueOf(args[1]);
		
		if (firstNumber > sn) {
			System.out.println(firstNumber + " is more then " + sn);
		}
		else {
			System.out.println(firstNumber + " is no more then " + sn);
		}
		System.out.println(firstNumber + sn);
	}
}
