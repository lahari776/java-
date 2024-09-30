package practice;
class product1{
	String pname1 = "akshaya";
	int id1 = 21;
	int m1 = 100;
	int m2 = 99;
	int t1 = m1+m2;
	
			
}
class product2 extends product1{
	String pname2 = "aksh";
	int id2 = 55;
	int sm1 = 88;
	int sm2 = 98;
	int t2 = sm1+sm2;

}
class product3 extends product2{
	String pname3 = "aksha";
	int id3 = 20;
	int tm1 = 19;
	int tm2 = 99;
	int t3 = tm1+tm2;

	}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         product3 obj = new product3();
         if (obj.t1>obj.t2  && obj.t1>obj.t3 ) {
        	 System.out.
         }
	}

}
