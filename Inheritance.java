package programs;
class Employee{
	int salary=60000;
}
class Engineer extends Employee{
	int bonus=10000;
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Engineer e1=new Engineer();
         System.out.println("salary"+e1.salary+"\nBonus"+e1.bonus );
         
	}

}
