import java.awt.*;
import java.util.*;
public class patterns2 {
    public static void main(String []args){
        /*
                * * * * *
                 * * * *
                  * * *
                   * *
                    *
         */
        int n=5;
        for(int i =n; i>=1; i--){
            for(int j=n-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int k = i; k>=1; k--){
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
            *
            * *
            * * *
            * * * *
            * * *
            * *
            *
         */
        int size =3;
        for(int i= size; i>=-size; i--){
            for(int j =size; j>=Math.abs(i); j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
            1 * * * *
            2 2 * * *
            3 3 3 * *
            4 4 4 4 *
            5 5 5 5 5
         */

        for(int i =1; i<=5; i++){
            for(int j =1; j<=5; j++){
                if(j>i){
                    System.out.print("* ");
                }
                else {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }

        /*
            5 5 5 5 5
            4 4 4 4 *
            3 3 3 * *
            2 2 * * *
            1 * * * *
         */

        for(int i =5; i>=1; i--){
            for(int j =1; j<=5; j++){
                if(j>i){
                    System.out.print("* ");
                }
                else{
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }

        /*
            * * * * 5
            * * * 4 4
            * * 3 3 3
            * 2 2 2 2
            1 1 1 1 1
         */
        for(int i=5; i>=1; i--){
            for(int j =1; j<=5; j++){
                if(i>j){
                    System.out.print("* ");
                }
                else{
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
