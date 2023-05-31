public class iv_Operators {
	public static void main(String[] args) {
		int num1 = 12; 
		int num2 = 6;


	// Arithmetic Operators
		System.out.println("Arithmetic Operators: ");
		System.out.println(num1 + num2); // addition
		System.out.println(num1 - num2); // subtraction
		System.out.println(num1 * num2); // multiplication 
		System.out.println((double)num2 / (double)num1); // division (if an int divides another int it print only the whole number) 	
		System.out.println(num1 % num2); // modular division
		System.out.println(Math.pow(num1,num2)); // raise to the power
		System.out.println(Math.sqrt(num2));//square root

	// Assignment Operators
		// (=) assign operator
		

	// Relationally Operators 

		System.out.println();
		System.out.println("Relationally Operators: ");
		System.out.println(num1 != num2); // not equal to
		System.out.println(num1 < num2); // less than  
		System.out.println(num1 > num2); // greater than
		System.out.println(num2 >=  num1); //greater or equal 
		System.out.println(num2 <= num1); // lesser than or equal
		System.out.println(num1  == num2); // must be that variable
		System.out.println();
		System.out.println(num1 += num2);
		System.out.println(num1 -= num2);
		System.out.println(num1 *= num2);
		System.out.println(num2 /= num1);
		
	// Logical Operators
		System.out.println();
		System.out.println("Logical Operators");
		int age=25;
		
		// && => and operator;
		// || => or operator;
		// ! => not operator;

		System.out.println(age>=18 && age<=40); // both side's needs to be true
		System.out.println(age>=31 || age<=35); // one side needs to be true
		System.out.println(age>=18 || !(age<=45));

	} //42:45
}