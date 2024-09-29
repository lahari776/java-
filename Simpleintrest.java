package programs;
import java.util.Scanner;

public class Simpleintrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scan =new Scanner(System.in);
           System.out.println("ENTER principle: ");
           int p=scan.nextInt();
           System.out.println("ENTER timeperiod: ");
           int t=scan.nextInt();
           System.out.println("ENTER rate: ");
           int r=scan.nextInt();
           System.out.println("simple intrest is "+(p*t*r)/100);
           
           
	}

}
