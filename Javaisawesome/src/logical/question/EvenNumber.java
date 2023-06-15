package logical.question;

public class EvenNumber {
	// 2 . While loop to print the even numbers between 1 and 100.
	// 2 , 4 , 6 , 8 ................................98

	public static void printEvenNumber() {
		for (int i = 1; i < 100; i = i + 1) {

			if (i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
	}

	public static void main(String[] args) {
      printEvenNumber(); // method call
	}

}
