package programs;
import java.util.Scanner;

public class Calculatoswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your fisrt number :" );
		int n1= scan.nextInt();
		System.out.print("Enter your second number :" );
		int n2= scan.nextInt();
		System.out.println("MENU");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.division");
		System.out.println("ENTER your choice");
		int choice= scan.nextInt();
		switch(choice) {
		case 1: System.out.println(n1+n2);
		        break;
		case 2: System.out.println(n1-n2);
	            break;
		case 3: System.out.println(n1*n2);
                break;
		case 4: System.out.println(n1/n2);
 		        break;
 		default: System.out.println("invalid choice");
		}

	}

}
