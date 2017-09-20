
public class Main {
	
	/**
	 * The main method calls the different methods of a TestCalculator object, and prints a message to tell you
	 * whether the tests were all successful or not
	 */
	public static void main(String[] args) {
		
		//initialises the passed variable to true, so that if all the tests pass it will remain true and the correct message will print
		boolean passed = true;
		TestCalculator myTester = new TestCalculator();
		
		//this piece of code runs the three tests in the TestCalculator object, and if any of them fail passed is set to false
		if(!myTester.testParser()) passed = false;
		if(!myTester.testAdd()) passed = false;
		if(!myTester.testMultiplication()) passed = false;
		
		//prints a positive or negative message depending on the result of the tests
		if(passed) System.out.println("Congratulations! Your calculator appears to be working correctly");
		else System.err.println("Oh dear! It appears some parts of your calculator do not work correctly");

	}

}
