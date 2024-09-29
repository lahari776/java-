package prac1;
abstract class Animals{
	public void cats() {}
	public void dogs() {}
}
class Cats extends Animals{
	public void cats() {
		System.out.println("meow");
	}

}
class Dogs extends Animals{
	public void dogs() {
		System.out.println("dogs bark");
	}

}
public class Animalsabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Cats o=new Cats();
      o.cats();
      Dogs o1=new Dogs();
      o1.dogs();
	}

}
