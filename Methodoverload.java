package programs;

public class Methodoverload {
	public int num(int x) {
		return x;
	}
	public int num(int x,int y) {
		return x+y;
	}
	public double num(double x,double y) {
		return x+y;
	}
public static void main(String[] args) {
	Methodoverload s=new Methodoverload();
	System.out.println(s.num(6));
	System.out.println(s.num(6,6));
	System.out.println(s.num(6.6,8.9));
}

}
