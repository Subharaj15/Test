package exception;

public class ThrowEx {
	
	public static void validate(int age)
	{
		if(age>=18)
			System.out.println("welcome to vote");
		else
			throw new ArithmeticException("age not valid");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			validate(9);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("rest of code.....");
	}

}
