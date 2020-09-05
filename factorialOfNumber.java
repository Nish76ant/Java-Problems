import java.util.Scanner;
public class FactorialOfNumerPractice 
{
    public static void main(String [] args)
    {
        //Factorial of a number
        //5! = 5*4*3*2*1
        //n! = n(n-1)*(n-2)----1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int factorial = 1;

        for(int i = n;i>=1;i--)
        {
            factorial = factorial*i;

        }
        System.out.println(factorial);

    }
    
}
