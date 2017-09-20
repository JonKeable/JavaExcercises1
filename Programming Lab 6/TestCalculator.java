
public class TestCalculator {
	
	
	Calculator myCalc = new Calculator();
	//used to check double values as there is rounding error in their floating point format
	double roundErr = 0.0001;
	
	/**
	 * tests the the x(String x) method of Calculator, which takes a String and computes the
	 * calculation which this String specifies
	 * @return
	 */
	protected boolean testParser() {
		//will be set to false if any test fails
		boolean passed = true;
		
		// Checks that the according to the calculator 12 + 5 ~= 17 accounting for rounding error
		if(Math.abs(myCalc.x("12 + 5") - 17) <= roundErr) System.out.println("[SUCCESS]	Basic parsing adds successfully.");
		else {
			passed = false;
			System.err.println("[FAIL]	Basic parsing fails to add.");
		}
		
		// Checks that the according to the calculator 12 x 5 ~= 60 accounting for rounding error
		if(Math.abs(myCalc.x("12 x 5") - 60) <= roundErr) System.out.println("[SUCCESS] Basic parsing multiplies successfully.");
		else {
			passed = false;
			System.err.println("[FAIL] Basic parsing fails to multiply.");
		}
		
		// Checks that the calculator will return null if you try to use an operator it doesn't recognise
		if(myCalc.x("12 [ 3") == null) System.out.println("[SUCCESS] Parse returns null for unsupported operators.");
		else {
			passed = false;
			System.err.println("[FAIL] Parser does not return null for unsupported operators.");
		}
		
		//returns true only if all tests were successful
		return passed;
	}
	
	/**
	 * Checks if the x(Double x)method in calculator adds the global variable to the local parameter
	 * it is passed correctly
	 * @return
	 */
	protected boolean testAdd() {
		
		//will be set to false if any test fails
		boolean passed = true;
		
		//creates some test numbers and gives them values
		Double testDub = 3.2; //n.b. must be a Double object so that the right overloaded method is called
		myCalc.x = 5.4;
		
		//tests that according to the method 3.2 + 5.4 ~= 8.6 accounting for rounding error
		if(Math.abs(myCalc.x(testDub) - 8.6) <= roundErr) System.out.println("[SUCCESS] Calculator adds correctly");
		else {
			passed = false;
			System.err.println("[FAIL] Calculator adds incorrectly");
		}

		//sets the test numbers to negative values
		testDub = -4.3;
		myCalc.x = -2.15;
		//tests that according to the method -4.3 + -2.15 ~= -6.45 accounting for rounding error
		if(Math.abs(myCalc.x(testDub) - (-6.45)) <= roundErr) System.out.println("[SUCCESS] Calculator adds with negative numbers correctly");
		else {
			passed = false;
			System.err.println("[FAIL] Calculator adds with negative numbers incorrectly");
		}
		
		//returns true only if both tests were successful
		return passed;
	}
	
	/**
	 * Checks if that the x(double x) method of calculator correctly multiplies the global variable
	 * by a number it is passed as a parameter
	 * @return
	 */
	protected boolean testMultiplication() {
		//set to false of any test fails
		boolean passed = true;
		
		//creates some test numbers and gives them values
		double testDub = 1.5; //n.b. must be a double primitive so that the right overloaded method is called
		myCalc.x = 2.8;
		
		//tests if according to the method 1.5 x 2.8 ~= 4.2 accounting for rounding error
		if(Math.abs(myCalc.x(testDub) - 4.2) <= roundErr) System.out.println("[SUCCESS] Calculator multiplies correctly");
		else {
			passed = false;
			System.err.println("[FAIL] Calculator multiplies incorrectly");
		}
		
		// sets one of the test numbers to a negative and another to positive
		testDub = -0.5;
		myCalc.x = 6.8;
		
		//tests if according to the method -0.5 x 6.8 ~= -3.4 accounting for rounding error
		if(Math.abs(myCalc.x(testDub) - (-3.4)) <= roundErr) System.out.println("[SUCCESS] Calculator multiplies with negative numbers correctly"); 
		else {
			passed = false;
			System.err.println("[FAIL] Calculator adds with negative numbers incorrectly");
		}
		
		//only returns true if both tests were successful
		return passed;
	}
}
