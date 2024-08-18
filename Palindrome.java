// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Palindrome{
    public static void main(String[] args) {
        Scanner string=new Scanner(System.in);
        String word;
        word=string.nextLine();
        String rev="";
        int n=word.length()-1;
        while(n>=0){
            rev=rev+word.charAt(n);
            n=n-1;
        }
        System.out.println(rev);
        if (word.equals(rev)){
            System.out.println(word+"is a palindrome");
        }
        else{
            System.out.println(word+"is not a palindrome");
        }
    }
}