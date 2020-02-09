import java.util.Scanner;

/**
 * @author Rohith
 *
 */
public class Sorting {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Sorting \nChoose: \n1. Ascending \n2. Descending");
		int choice = scan.nextInt();
		
		System.out.println("How many elements are there in the array");
		int n = scan.nextInt();
		int []arr = new int[n];
		
		System.out.println("Enter the Array");
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		int temp=0;
		switch(choice) {
		case 1:
			System.out.println("Ordering the Array in Ascending Order");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					}
				}
			}
		break;
		case 2:
			System.out.println("Ordering the Array in Descending Order");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					}
				}
			}

		}
		for(int x:arr) {
			System.out.println(x);
		}
	}
}
