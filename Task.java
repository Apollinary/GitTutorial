package at;

public class Task {

	public static void main(String args[]) {
		System.out.println("This line added into somefix.");
		System.out.println("This line added into new_branch.");
		System.out.println("This line edited in branch1 after somefix merge.");
		System.out.println("This line is added in branch somefix after merge.");

		int firstNumber = Integer.valueOf(args[0]);
		int secondNumber = Integer.valueOf(args[1]);
		
		if (firstNumber > secondNumber) {
			System.out.println(firstNumber + " is more then " + secondNumber);
		}
		else {
			System.out.println(firstNumber + " is no more then " + secondNumber);
		}
		System.out.println(firstNumber + secondNumber);
	}
}
