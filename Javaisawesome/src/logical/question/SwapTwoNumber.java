package logical.question;

public class SwapTwoNumber {

	// input parameter // output data

	public static void swapNumber(int a, int b) {
		System.out.println("Before Swaping Value: a = " + a + ", b = " + b);
		a = a+b;  //30   // a = 20,   b = 10
		b = a-b;  // 30-20 = 10
		a = a-b; // 30 - 10  = 20
		System.out.println("After Swaping Value: a = " + a + ", b = " + b);

	}
	
	public static void main(String[] args) {
		swapNumber(10, 20);
	}

}
