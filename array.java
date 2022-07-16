import java.util.Scanner;

public class array {
    public static void main(String[] args){
        /*
         * Array is a collection of similar datatype (element).
         * EX: x=[2,5,7,6]
         * C = ['a','b','c']
         * Syntax :
         *         int ary[] = new int[5];
         *         or int []ary = new int[5] 5 is size of array
         *         ary[] = reference and int[5] is objects.
         *         int ary1[] = {1,2,4,5,6};
         *         int c[];
         *         c = new int[10] size of array
         */
        /**
        // find the length of the array.
        int []a = new int[10];
        int []b = {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println("Length of array a is: "+a.length);
        System.out.println("Length of array b is: "+b.length);
        System.out.println(b[5]);

        //Print all value given is array b
        for(int i=0; i<=b.length; i++){
            System.out.println(i);
        }

        System.out.println("Print array b values in different way");
        for(int x:b){
            System.out.println(x);
        }

        // print is reverse array of b

        System.out.println("Reverse value is");
        for(int j =b.length-1; j>=0; j--){
            System.out.println(j);
        }
        */

        // Find sum of all elements?
        int []num = {3,9,7,8,12,6,15,5,4,10,30};
        int sum=0;
        for(int x:num){
            sum=sum+x;
        }
        System.out.println("Sum is: "+sum);
        /**
        //Searching an element
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a key: ");
        int key = sc.nextInt();
        for(int i=0; i<=num.length; i++){
            if(key==num[i]){
                System.out.println("Element found at: "+i);
                System.exit(0);
            }
        }
        System.out.println("Element not found");
        */

        //Finding maximum element

        // Finding second largest element
        int max1, max2;
        max1=max2=num[0];
        for (int j : num) {
            if (j > max1) {
                max2 = max1;
                max1 = j;
            } else if (j > max2) {
                max2 = j;
            }
        }
        System.out.println("Second largest number is: "+max2);
        System.out.println("Largest number is: "+max1);
/**
        // Rotating an array
        for(int x:num){
            System.out.print(x+",");
        }
        System.out.println("");
        int temp = num[0];

        for(int i=1; i<num.length; i++){
            num[i-1]=num[i];
        }
        num[num.length-1]=temp;

        for(int x : num){
            System.out.print(x+",");
        }
        System.out.println("");
*/

        // Inserting an element
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for 0 to 10: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print(num[i]+",");
        }
        System.out.println("");
        System.out.print("Enter inserting element: ");
        int x = sc.nextInt();
        System.out.print("Enter the index between 1 to 9: ");
        int index = sc.nextInt();
        for(int i = n; i>index; i--){
            num[i]= num[i-1];
        }
        num[index]=x;
        for(int i =0; i<n; i++){
            System.out.print(num[i]+",");
        }
        System.out.println("");


        // Deleting an element
    }
}
