/*
* A palindrome number is a number that is same after reverse. 
    * For example 34543, 171, 48984 are the palindrome numbers. 
* It can also be a string like LOL, MADAM etc.
 */
import java.util.*;
public class palindrome_number {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check palindrome number: ");
        int num = sc.nextInt();
        int temp, sum=0;

        temp = num;
        while (num>0){
            int rem = num%10;
            sum = (sum*10)+rem;
            num = num/10;
        }
        if(temp==sum){
            System.out.println("Palindrome number");
        }
        else {
            System.out.println("Not a palindrome number");
        }
    }
}
