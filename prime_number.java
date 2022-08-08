/*
prime number is a number that is divisible only by 1 and itself.
Foe example:
 * 5 is a prime number as it is divisible only by 1 and 5.
 * 6 is not a prime number it is divisible by1 , 2 ,3 and itself.
 */

import java.util.*;
public class prime_number {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = 0;
        for(int i =1; i<=number; i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(number+" Is a prime number");
        }
        else {
            System.out.println(number+" is not a prime number");
        }
    }
}
