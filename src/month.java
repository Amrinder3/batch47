import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        int Month;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your month");
        Month = sc.nextInt();
        if (Month==1||Month==3||Month==5||Month==7||Month==8||Month==10||Month==12)
{
    System.out.println("31 Days");
}
else if (Month==2){
            System.out.println("28 Days");
}
else if(Month==4||Month==6||Month==9||Month==11){
            System.out.println("30 Days");
}else
            System.out.println("invalid input");
}}