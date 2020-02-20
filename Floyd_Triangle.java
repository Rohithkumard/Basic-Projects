/**
 * @author Rohith
 *
 */
public class Floyd_Triangle {

	public static void main(String[] args) {
		int n=1;
		for(int j=0;j<5;j++) {
		for(int i=0;i<=j;i++) {
			System.out.print(n);
		}
		n++;
		System.out.println();
		}
	}
}