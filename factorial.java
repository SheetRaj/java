/*
*  Factorial in mathematics the product of all positive integers less than or equal to a given positive integer and denoted by the integer and an exclamation point.
* Thus, factorial five is written 5! meaning 5x4x3x2x1.
* Factorial zero is defines ad equal to 1.
* */

import java.util.*;
public class factorial {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int factorial =1;
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        for(int i =1; i<=number; i++){
            factorial= factorial*i;
        }
        System.out.println("Factorial of "+number+" is "+factorial);
    }
}
