import java.util.Scanner;

/**
 * @author Rohith
 *
 */
public class LargestSmallest {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please choose : \n1.Find Largest in an array\n2.Find Smallest in an array");
		int choice = scan.nextInt();
	
		System.out.println("Enter the length of the array");
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the array");
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		int dummy = 0;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length-1;j++) {
					if(arr[j] > arr[j+1]) {
						dummy = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = dummy;
					}
				}
			}
		switch (choice) {
		case 1:
			System.out.println("The Largest number in an array is : "+arr[n-1]);
			break;
		case 2:
			System.out.println("The Smallest number in an array is : "+arr[0]);
			break;
		}
		scan.close();
	}
}