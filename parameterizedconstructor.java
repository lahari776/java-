package programs;

public class parameterizedconstructor {
    int x;
    public parameterizedconstructor(int y) {
    	x=y;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameterizedconstructor myobj = new parameterizedconstructor(10);
		System.out.println(myobj.x);

	}

}
