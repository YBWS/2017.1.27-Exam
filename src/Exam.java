import java.util.Scanner;

/**
 * 
 */

/**
 * @author b.yang
 *
 */
public class Exam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		String userOperation;
		do{
		
		System.out.println("What operation do you want to use?");
		userOperation = userInput.nextLine();
		
		
		if(userOperation.equals("factorial")){
			System.out.println("Please enter your number:");
			double userNumber = userInput.nextDouble();
			String emptyLine1 = userInput.nextLine();
			System.out.println(factorial((long)userNumber));
		}
		
		else if(userOperation.equals("log")){
			System.out.println("Please enter your number");
			double userNumber = userInput.nextDouble();
			String emptyLine1 = userInput.nextLine();
			System.out.println(log10(userNumber));
		}
		
		else if(userOperation.equals("ln")){
			System.out.println("Please enter your number");
			double userNumber = userInput.nextDouble();
			String emptyLine1 = userInput.nextLine();
			System.out.println(loge(userNumber));
		}
		
		else if(userOperation.equals("pi")){
			System.out.println(Math.PI);
		}
		
		else if(userOperation.equals("sin")){
			System.out.println("Please enter your number");
			double userNumber = userInput.nextDouble();
			String emptyLine1 = userInput.nextLine();
			System.out.println(Math.sin(userNumber*Math.PI/180));
		}
		
		else if(userOperation.equals("cos")){
			System.out.println("Please enter your number");
			double userNumber = userInput.nextDouble();
			String emptyLine1 = userInput.nextLine();
			System.out.println(Math.cos(userNumber*Math.PI/180));
		}
		
		else if(userOperation.equals("tan")){
			System.out.println("Please enter your number");
			double userNumber = userInput.nextDouble();
			String emptyLine1 = userInput.nextLine();
			System.out.println(Math.tan(userNumber*Math.PI/180));
		}
		
		else if(userOperation.equals("asin")){
			System.out.println("Please enter your number");
			double userNumber = userInput.nextDouble();
			String emptyLine1 = userInput.nextLine();
			System.out.println(Math.asin(userNumber));
		}
		
		else if(userOperation.equals("acos")){
			System.out.println("Please enter your number");
			double userNumber = userInput.nextDouble();
			String emptyLine1 = userInput.nextLine();
			System.out.println(Math.acos(userNumber));
		}
		
		else if(userOperation.equals("atan")){
			System.out.println("Please enter your number");
			double userNumber = userInput.nextDouble();
			String emptyLine1 = userInput.nextLine();
			System.out.println(Math.atan(userNumber));
		}
		
		
		
		else if(userOperation.equals("pow")){
			System.out.println("Please enter your number");
			double userNumber = userInput.nextDouble();
			String emptyLine1 = userInput.nextLine();
			System.out.println("Please enter the power");
			int userPower = userInput.nextInt();
			String emptyLine2 = userInput.nextLine();			
			System.out.println(power(userNumber,userPower));
		}
		
		else if(userOperation.equals("root")){
			System.out.println("Please enter your number");
			double userNumber = userInput.nextDouble();
			String emptyLine1 = userInput.nextLine();
			System.out.println("Please enter the root");
			double userRoot = userInput.nextDouble();
			String emptyLine2 = userInput.nextLine();			
			System.out.println(Math.pow(userNumber, (1.0/userRoot)));
		}
		
		else if(userOperation.equals("Permutation")){
			System.out.println("Please enter total items");
			int userN = userInput.nextInt();
			String emptyLine1 = userInput.nextLine();
			System.out.println("Please enter number of items per group");
			int userR = userInput.nextInt();
			String emptyLine2 = userInput.nextLine();			
			System.out.println(permutate(userN, userR));
		}
		
		else if(userOperation.equals("Combination")){
			System.out.println("Please enter total items");
			int userN = userInput.nextInt();
			String emptyLine1 = userInput.nextLine();
			System.out.println("Please enter number of items per group");
			int userR = userInput.nextInt();
			String emptyLine2 = userInput.nextLine();			
			System.out.println(combine(userN, userR));
		}
		} while(!userOperation.equals("Stop"));
		
		userInput.close();
		
		
	}
	
	public static long factorial(long number) {
		
		/**
		 *For example,the factorial of 5 is 5*4*3*2*1 = 120.
		 *
		 *@param the "factorial" is just like the 5 in the example.
		 *@return The value of whatever the user input.
		 *
		 */
		
		long factorial = number;
		 
		for(long i =(number - 1); i > 1; i--)
		{
			factorial = factorial * i;			
		}
		
		return factorial;
	}
	
	public static double log10(double number) {
		return Math.log10(number);//use the Math Class to calculate.
	}
	
	public static double loge(double number) {
		return Math.log(number);//use the Math Class to calculate
	}
	
	public static double power(double number, int power) {
		
		/**
		 * The power will have 3 situation: negative,0,positive
		 * 
		 * @param
		 * @return
		 * 
		 */
		if(power<0){
			number=1.0/number;
		}else if(power==0){
			return 1.0;
		}
		
		for(int i =1;i<Math.abs(power);i++){
			number *= number;			
		}
		return number;
		
		}
	
	public static long permutate(int n, int r){
		
		/**
		 * 
		 */
		long ans = factorial(n)/factorial(n-r);
		return ans;
		
	}
	public static long combine(int n, int r){
			long ans = factorial(n)/(factorial(r)*factorial(n-r));
			return ans;

	}

}


