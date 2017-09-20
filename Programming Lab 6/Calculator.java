public class Calculator {
        Double x;
        /**
        * Chops up input on ' ' then decides whether to add or multiply.
        * If the string does not contain a valid format returns null.
        */
        public Double x(String x){
        		//sets the instance variable x to the value of the first number in an expression.
        		//e.g. for "9.2 + 3", x would be set to 9.2.
        		this.x = this.x.parseDouble(x.split(" ")[0]);
        		//if the operator in the string is "+" call the adding method by parsing it a Double object (as the x method is overloaded)
        		//which is equal to the value of the second number in the string, e.g. for "9.2 + 3", x would be passed 3 as an object.
        		if(x.split(" ")[1].equals("+")) return x(new Double (this.x.parseDouble(x.split(" ")[2])));
        		//if the operator in the string is "x" call the multiplication method by parsing it a double primitive (as the x method is overloaded)
        		//which is equal to the value of the second number in the string, e.g. for "9.2 x 3", x would be passed 3 as a primitive.
        		else if(x.split(" ")[1].equals("x")) return x(this.x.parseDouble(x.split(" ")[2]));
        			//if the operator is neither "+" nor "x", returns null to denote that the operator is not supported by the calculator.
        			else	return null;
        }

        /**
        * Adds the parameter x to the instance variable x and returns the answer as a Double.
        */
        public Double x(Double x){
                System.out.println("== Adding ==");
                x = x + this.x;
                return new Double(x);
        }

        /**
        * Multiplies the parameter x by instance variable x and return the value as a Double.
        */
        public Double x(double x){
                System.out.println("== Multiplying ==");
                x = x * this.x;
                return new Double(x);
        }

}
