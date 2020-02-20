import java.util.Scanner;

/**
 * @author Rohith
 *
 */
public class RepeatationOfPerticularChar {

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String sen = scan.nextLine();
		int count=0;
		System.out.println("Enter the char to check Repeatation");
		char c[] = (scan.nextLine().toCharArray());
		
		for(int i=0;i<sen.length();i++) {
			if(sen.charAt(i)==c[0]) {
				++count;
			}
		}
		System.out.println("The char "+ c[0]+" is Repeated "+count+" times");
		scan.close();
	}
}
