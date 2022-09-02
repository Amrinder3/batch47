import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        int random= (int)(Math.random()*10);


                Scanner sc= new Scanner(System.in);
        boolean flag=true;

        while (flag){
            System.out.println("guess the number");
            int anInt= sc.nextInt();
            if (random==anInt) {
                System.out.println("right guess!!!! you win");
                flag = false;
            }
            else{
                System.out.println("try again");
            }
        }
    }
}
