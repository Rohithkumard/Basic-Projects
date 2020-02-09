import java.util.Scanner;

/**
 * 
 */

/**
 * @author Rohith
 *
 */
public class Anagramy {

	
	public static void main(String[] args) {
		String word = "";
		String jumbled_word = "";
		do {
			
		System.out.println("\nThe Length of Both word Should be Equal");
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word : ");
		word = scan.nextLine();
		
		System.out.println("Enter the Jumbled Word : ");
		jumbled_word = scan.nextLine();
		
		}while(word.length() > jumbled_word.length() | word.length() < jumbled_word.length());
		
			for(int i=0;i<word.length();i++) {
				for(int j=0;j<word.length();j++) {
					if(word.charAt(i) == jumbled_word.charAt(j)) {
						jumbled_word = jumbled_word.substring(0, j) + jumbled_word.substring(j + 1);
						break;
					}
					
				}
			}
			if(jumbled_word.equals("")) {
				System.out.println("It's an Anagramy word");
			}else {
				System.out.println("Not an Anagramy word");
			}
			
		}//end of main
	}//end of class
