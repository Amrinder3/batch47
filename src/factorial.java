import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fact=1;
        int vg=1;


        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        for(int i=n;i>=1;i--)
        fact=fact * i;
        System.out.println("factorial of first five numbers is" + fact);
    }
}
