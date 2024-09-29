package prac1;

import java.util.Scanner;

public class Palindrome {
    public static boolean checkpalindrome(String s) {
    	int length=s.length();
    	for(int i=0;i<length/2;i++) {
    		if(s.charAt(i)!=s.charAt(length-i-1)) {
    			return false;
    		}
    	}
    	return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your string:");
		String str=scan.nextLine();
		Palindrome onj=new Palindrome();
		
		if(checkpalindrome(str)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");

		}

	}

}
