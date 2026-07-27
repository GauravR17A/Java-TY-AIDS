
import java.util.Scanner;

public class c3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the no ");
        int a = sc.nextInt();
        System.err.println("Enter the no ");
        int b = sc.nextInt();

        if(a%2==0){
            System.err.println("Even no detected");
        }else{
            System.err.println("Odd no detected");
        }

        System.err.println("Sum of two nos entered is : " + (a+b));
    }
}