package testingExample;

import java.util.Scanner;

class Amt2Words{
	
	private static final String Empty = null;

	private static final String X[] = {Empty, "One ", "Two ", "Three ", "Four ", "Five ", "Six ",
			"Seven ", "Eight ", "Nine ", Empty, "Eleven ","Twelve ",
			"Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ",
			"Seventeen ", "Eighteen ", "Nineteen "}; 
	
	private static final String[] Y = {Empty, "Ten ", "Twenty ","Thirty ","Forty ", "Fifty ",
			"Sixty ", "Seventy ", "Eighty ", "Ninety "}; 
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		String num = s.nextLine();
		convert(num);
	}//end of main

	private static void convert(String num) {
		int numt = Integer.parseInt(num);
		String l = convert2words((numt / 100000), "Lakh,");
		String t = convert2words((numt / 1000) % 100, "Thousand,");
		String h = convert2words((numt % 1000) /100, "Hundred");
		String rp = convert2words((numt % 100), "");
		
		System.out.println(l+" "+t+" "+h+" and "+rp +"rupees");
	}

	private static String convert2words(int k, String string) {

		if(k>19) {
			String num = String.valueOf(k);
			char i = num.charAt(0);
			char j = num.charAt(1);
			//String.valueOf(i);
			int i1 = Integer.parseInt(String.valueOf(i));
			int j1 = Integer.parseInt(String.valueOf(j));
			String v = Y[i1] + X[j1];
			return v + string;
		}
		if(k == 0) {
			return "";
		}
		else{
			String v = X[k];
			return v + string;
		}
	}
}//end of class