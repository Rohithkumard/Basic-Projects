import java.util.Scanner;

/*
 * @author Rohith
 *
 */
public class Password_Generator {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How long the password should be???");
		int n = scan.nextInt();
		
		String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz"; 
		
		StringBuilder s = new StringBuilder(n);
		
		for(int i=0; i<n; i++) {
		int ran = (int)(data.length() * Math.random());
			s.append(data.charAt(ran));
			
		}
		System.out.println("The Password is : "+s);
		}
}