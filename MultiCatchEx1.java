package exception;

public class MultiCatchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int  a[]=new int[5];
			a[7]=20/0;
		}
       catch(ArrayIndexOutOfBoundsException e) {
    	   System.err.println(e);
       }
		System.out.println("rest of code......");
	}

}
