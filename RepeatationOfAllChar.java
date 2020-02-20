import java.util.Scanner;

/**
 * @author Rohith
 *
 */
public class RepeatationOfAllChar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String sen = scan.nextLine();
		int count=0;
		for(int i=0;i<sen.length();i++) {
			
			for(int j=0;j<sen.length();j++) {
					if(sen.charAt(i) == sen.charAt(j)) {
						++count;
				}
			}
			RepeatationOfAllChar.disp(sen.charAt(i), count);
			count = 0;
		}
		scan.close();
	}//end of main

	private static void disp(char charAt, int count) {
		System.out.println("The Character "+charAt+" is repeated "+count+" times");
	}//end of disp
}//end of class