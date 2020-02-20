import java.util.Scanner;

/**
 * @author Rohith
 *
 */
public class LeapYear {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		do {
		System.out.println("Enter the Year");
		int year = scan.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			System.out.println("Leap Year");
		}else {
			System.out.println("Not A Leap year");
		}
		
		System.out.println("Do You want to check again with different year\n1.YES\n2.NO");
		i = scan.nextInt();
		
		}while(i==1);
		
		System.out.println("End");
		scan.close();
	}

}