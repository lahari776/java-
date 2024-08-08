package programs;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=19;
        int r;
        int count=0;
        for(int i=2;i<n;i++) {
         r=n%i;
         if(r==0) {
        	 count=count+1;
         }
        }
        if(count==0) {
        	System.out.println(n+" is a prime number");
        }
        else {
        	System.out.println(n+" is not a prime number");
        }
	}

}
