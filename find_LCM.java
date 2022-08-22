import java.util.Scanner;

public class find_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest, smaller,LCM;
        System.out.print("Enter the value: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1>num2){
            largest = num1;
            smaller = num2;
        }
        else {
            largest = num2;
            smaller = num1;
        }
        for(int i=1; i<=largest; i++){
            if(((largest*i)%smaller)==0){
                LCM = largest*i;
                System.out.println("LCM is: "+LCM);
                break;
            }
        }

    }
}
