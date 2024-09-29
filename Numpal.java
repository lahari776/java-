package prac1;

import java.util.Scanner;

public class Numpal {
	int n;
    public Numpal(int n) {
    	this.n=n;
    }
    public void palindrome() {
    	int r=0;
    	int rev=0;
    	int num=n;
    	while(n>0) {
    		r=n%10;
    		rev=r+rev*10;
    		n=n/10;
    	}
    	if(num==rev) {
    		System.out.println("palaindrome");
    	}
    	else {
    		System.out.println("not palaindrome");

    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan =new Scanner(System.in);
  	    System.out.println("enter num: ");
  	    int l=scan.nextInt();
        Numpal o=new Numpal(l);
        o.palindrome();
	}

}
