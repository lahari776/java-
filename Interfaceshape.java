package prac1;
import java.util.Scanner;
interface shape{
    void printArea();
}
class rectangle implements shape{
    int length;
    int breadth;
    public rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void printArea(){
        System.out.println(length*breadth);
    }
}
class triangle implements shape{
    int height;
    int base;
    public triangle(int height,int base){
        this.height=height;
        this.base=base;
    }
    public void printArea(){
        System.out.println(height*base*0.5);
    }
}
class circles implements shape{
    int radius;
    public circles(int radius){
        this.radius=radius;
    }
    public void printArea(){
        System.out.println(3.14*radius*radius);
    }
}

        
   
public class Interfaceshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter length: ");
	    int l=scan.nextInt();
	    System.out.println("enter breadth: ");
	    int b=scan.nextInt();
        rectangle o=new rectangle(l,b);
        o.printArea();
	    System.out.println("enter base: ");
	    int ba=scan.nextInt();
	    System.out.println("enter height: ");
	    int h=scan.nextInt();        
        triangle o1=new triangle(ba,h);
        o1.printArea();
	    System.out.println("enter radius: ");
	    int r=scan.nextInt();

        circles o3=new circles(r);
        o3.printArea();

	}

}
