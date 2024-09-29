package programs;

public class Empdetails {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name=newName;
		
	}
	

}
class test{
	public static void main(String args[]) {
		Empdetails A =new Empdetails();
		A.setName("sanjana");
		System.out.println(A.getName());
	}
}