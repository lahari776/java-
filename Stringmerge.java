package prac1;

import java.util.Scanner;

public class Stringmerge {
    String s1,s2;
    public Stringmerge(String s1,String s2) {
    	this.s1=s1;
    	this.s2=s2;
    }
    public void merge() {
    	System.out.println("merged string :"+s1+s2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter first: ");
	    String l=scan.nextLine();
	    System.out.println("enter 2nd: ");
	    String b=scan.nextLine();
        Stringmerge o=new Stringmerge(l,b);
        o.merge();
        
	}

}
