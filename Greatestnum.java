package prac1;
import java.lang.Math;
import java.util.Scanner;
public class Greatestnum {
	int a,b,c;
    public Greatestnum(int a,int b,int c) {
    	this.a=a;
    	this.b=b;
    	this.c=c;
    			
    }
    public void greatnum() {
    	System.out.println("greatest num is :"+Math.max(Math.max(a, b),c));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter first num: ");
	    int l=scan.nextInt();
	    System.out.println("enter 2nd num: ");
	    int b=scan.nextInt();
	    System.out.println("enter 3rd num: ");
	    int h=scan.nextInt();
	    Greatestnum o=new Greatestnum(l,b,h);
	    o.greatnum();

	}

}
