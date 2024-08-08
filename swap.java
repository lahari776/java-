package programs;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		int b=7;
		System.out.println("before swapping a is "+a+" b is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping a is "+a+" b is "+b);

	}

}
