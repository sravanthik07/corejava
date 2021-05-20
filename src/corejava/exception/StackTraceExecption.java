package corejava.exception;

public class StackTraceExecption {

	public static void main(String[] args) {

		try {
			System.out.println(10/0);
		}catch(Exception e) {
			//e.printStackTrace(); //Name, description and stack trace
		//	System.out.println(e.toString()); //Name of the exception, description only
		//	System.out.println(e);  //Name of the exception, description only
			System.out.println(e.getMessage());  //Description of the exception only
		}
	}

}
