package practice;
class product1{
	String pname1 = "sugar";
	int quantity1 = 200;
	int cost1 = 500;
	
			
}
class product2 extends product1{
	String pname2 = "bellam";
	int quantity2 = 100;
	int cost2 = 250;
}
class product3 extends product2{
	String pname3 = "lottechocopie";
	int quantity3 = 50;
	int cost3 = 300;
}
public class Productdet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product3 obj = new product3();
		
		if ((obj.cost1> obj.cost2) && (obj.cost1>obj.cost3)) {
			System.out.println(obj.cost1);
	
		}
		else if(obj.cost2>obj.cost3) {
			System.out.println(obj.cost2);

			
		}

		else {
			System.out.println(obj.cost3);
		
			
		}
              
	}

}
