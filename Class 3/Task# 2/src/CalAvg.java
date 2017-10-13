/*Author: Syed Hussain
 * Purpose: Declare and initialize that stores a sum and an int variable that stores a count
 * 			Calculate an average by dividing the sum variable. Then, assign the result of the calculation to the average variable and print it to the console. When you are done, the console by the count variable and print it to the console should look like this:
 * 				Sum: 301.75
 * 				Count: 6
 * 				Average: 50.29166666666666664
 * 			Run the application
 * 			Add an assignment statement that changes the value for the sum variable 
 * 			Run the application(print to the console for the sum and average ) 
 * Date: 06/22/17
 * */
import java.util.*;
public class CalAvg {

	public static void main(String[] args) {
		
		System.out.println("Enter sum and count");
		
		Scanner sc = new Scanner(System.in);
		
		double sum = sc.nextDouble();
		int count = sc.nextInt();
		
		System.out.println(sum + "\n" + count);
		
		double average= sum/count;
		System.out.println(average);
		
	}

}
