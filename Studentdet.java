package programs;
import java.util.Scanner;
public class Studentdet {

	public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Scanner scan2 =new Scanner(System.in);
        System.out.print("enter student name :");
        String studentname=scan.nextLine();
        System.out.print("enter student roll no :");
        int rollno= scan.nextInt();
        System.out.print("enter student branch :");
        String branch= scan2.nextLine();
        System.out.println("Name : "+studentname);
        System.out.println("Roll no : "+rollno);
        System.out.println("branch : "+branch);
	}

}