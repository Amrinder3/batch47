import java.util.Scanner;

public class array {
    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number of subjects");
        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the marks of  " +(i+1)+ " subject");
            arr[i]=sc.nextInt();
        }


        int sum = 0;
        for (int i =0; i<arr.length; i++)
        {
            sum = sum+arr[i];

        }
        System.out.println("total number  "  +sum);

        System.out.println("average is " +(sum/arr.length));
    }
}
