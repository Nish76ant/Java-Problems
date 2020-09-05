/* Write a program to print Fibonacci series of n ternms
where n is input by user 0 1 1 2 3 8 13 24
*/
import java.util.Scanner;
public class FibonacciSeriesPractice 
{
    public static void main(String [] args)
    {
        //fibonacci series
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a+" ");
        System.out.println(b+" ");

        for(int i = 0;i<n-2;i++)
        {
            int c = a+b;
            System.out.println(c+" ");
            a = b;
            b = c;
        }



    }
    
}
