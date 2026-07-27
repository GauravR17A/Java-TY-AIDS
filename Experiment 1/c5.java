
import java.util.Scanner;

public class c5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the no ");
        int n = sc.nextInt();
        int revint = 0;

        while(n!=0){
            revint = revint *10 + n%10;
            n /= 10;
        }

        System.err.println("Reversed number is : " + revint);

        sc.close();
    }
}