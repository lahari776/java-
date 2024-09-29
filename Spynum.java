package prac1;
import java.util.Scanner;
public class Spynum {
	int n;
    public Spynum(int n) {
    	this.n=n;
    }
    public void spyn() {
    	if(n<0) {
    		System.out.println("invlaid");
    	}
    	else {
    		int sum=0;
    		int product=1;
    		while(n>0) {
    			sum=sum+n%10;
    			product=product*n%10;
    			n=n/10;
    		}
    		if(sum==product) {
    			System.out.println("SPynum");
    		}
    		else {
    			System.out.println("Not SPynum");

    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan =new Scanner(System.in);
  	    System.out.println("enter first num: ");
  	    int l=scan.nextInt();
  	    Spynum o=new Spynum(l);
  	    o.spyn();
  	    
	}

}
