package prac1;

import java.util.Scanner;

public class Fourequal {
	int a,b,c,d;
    public Fourequal(int a,int b,int c,int d) {
    	this.a=a;
    	this.b=b;
    	this.c=c;
    	this.d=d;
    }
    public void equal() {
    	if((a==b)&&(b==c)&&(c==d)){
    	System.out.println("equal");
    }
    	else {
        	System.out.println("not equal");

    	}
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
	    System.out.println("enter 4rd num: ");
	    int m=scan.nextInt();
	    Fourequal o=new Fourequal(l,b,h,m);
	    o.equal();
	}

}
