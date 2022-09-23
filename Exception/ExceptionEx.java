package exception;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int c=10/0;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			//e.printStackTrace();
		}
		System.out.println("rest of the code.......");

	}

}
