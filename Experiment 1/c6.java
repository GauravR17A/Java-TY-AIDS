
import java.util.Scanner;

public class c6{

    static int getFactorial(int n){
        if(n==0||n==1) return n;

        return n*getFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = getFactorial(n);

        System.err.println(factorial);
    }
}