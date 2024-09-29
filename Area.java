package prac1;

import java.util.Scanner;

public class Area {
	int length,width,radius;
    public Area(int length,int width,int radius) {
    	this.length=length;
    	this.width=width;
    	this.radius=radius;
    }
    public void carea() {
    	System.out.println("circle area is"+3.14*radius*radius);
    }
    public void rarea() {
    	System.out.println("rectangle area is"+length*width);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter length: ");
	    int l=scan.nextInt();
	    System.out.println("enter breadth: ");
	    int b=scan.nextInt();
	    System.out.println("enter radius: ");
	    int r=scan.nextInt();
        Area obj=new Area(l,b,r);
        obj.carea();
        obj.rarea();
        
	}

}
