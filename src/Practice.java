import java.util.Scanner;

//
//If a=1, b=2, c=3, …………. z= 26, Input your name and calculate the sum total of your name?
//Example: 
//Input: java 
//Output: 34
//
//(where j=10, a=1, v=22, a=1)

public class Practice {

	public static void main(String[] args) {

		System.out.println("Input your name :");
		Scanner sc = new Scanner(System.in);
           String val = sc.next();
           sc.close();

        int sum = 0;   
		for (char e : val.toCharArray()) {
		     System.out.print(Character.toLowerCase(e));
			sum+= (int) Character.toLowerCase(e) - 96;
		}
		System.out.println("\nOutput: " + sum);
//		for (int i=0 ; sc.hasNext() ; i ++)
//		{
//			
//		
//		System.out.println((int) 'h' - 96);
//	
//		}

//		System.out.println("output : " + sum);

//		for ()

		// String name = "Garima";

		// g+a+r+i+m+a = sum ;
		// int sum = 0;
//		for (char e : name.toCharArray()) {
//
//		}
//		System.out.println();

	}

}
