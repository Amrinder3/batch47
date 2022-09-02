import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int n = Sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the marks for"+ (i+1)+ "Subject");
                    arr[i]=Sc.nextInt();
        }
    int sum= 0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }

            System.out.println("sum of subjects is "+sum);
        }
    }


