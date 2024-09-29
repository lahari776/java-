package prac1;
import java.util.Scanner;
class Weekday{
	public void Week(int num) {
		int day=num%7+1;
		switch(day) {
		case 1:System.out.println("Sunday");
		       break;
		case 2:System.out.println("Monday");
	       break;
		case 3:System.out.println("Tuesday");
	       break;
		case 4:System.out.println("Wednesday");
	       break;
		case 5:System.out.println("Thursday");
	       break;
		case 6:System.out.println("Friday");
	       break;
		case 7:System.out.println("Saturday");
	       break;
		default:System.out.println("invalid");
		}
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number:");
		Weekday obj=new Weekday();
		int num=scan.nextInt();
		obj.Week(num);
		

	}

}
