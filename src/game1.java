import java.util.Scanner;

public class game1 {
            public static void main(String[] args) {
                int random= (int)(Math.random()*10);
                Scanner sc= new Scanner(System.in);

                boolean flag=true;
                while (flag){
                    System.out.println("Guess the number");
                    int number=sc.nextInt();


                    if (random==number) {
                        System.out.println("right guess, you win!!!!");
                        flag = false;
                    }
                    else
                    {
                        if (random>number) {
                            System.out.println("hint-try bigger number");
                        }
                        else if(random<number){
                            System.out.println("hint-try smaller number");
                        }
                    }

                }
            }

        }


