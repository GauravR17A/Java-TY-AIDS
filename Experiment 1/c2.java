import java.util.Scanner;

public class c2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.err.println("Greatest No is " + a);
        }else if(b>a && b>c){
            System.err.println("Greatest No is "+ b);
        }else{
            System.err.println("Greatest No is " + c);
        }
    }
}
