public class palindromenum {
    public static boolean ispalindrome(int num){
        int onum=num;
        int rnum=0;
        int r;
        while(num!=0){
            r=num%10;
            rnum=rnum*10+r;
            num/=10;
        }
        return onum==rnum;
    }
    public static void main(String args[]){
        int n=53;
        if(ispalindrome(n)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
          
        }
    }
}
