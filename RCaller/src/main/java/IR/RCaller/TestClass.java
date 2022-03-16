package IR.RCaller;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class TestClass {

	public static void main(String[] args) throws RserveException,REXPMismatchException {
		RConnection c = new RConnection();
		// source the Palindrom function
		c.eval("source('C:/Users/Rostom/Desktop/Misc/Git Projects/RCaller/R Script/test.r')");
		// call the function. Return true
		REXP is_aba_palindrome = c.eval("palindrome('aba')");
		System.out.println(is_aba_palindrome.asInteger()); // prints 1 => true
		// call the function. return false
		REXP is_abc_palindrome = c.eval("palindrome('abc')");
		System.out.println(is_abc_palindrome.asInteger()); 
	}
}  


