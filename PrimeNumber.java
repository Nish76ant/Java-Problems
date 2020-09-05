import java.util.Scanner;
public class PrimeNumberOrNotPractice 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        //number is prime or not
        System.out.println("Please Enter the number");
        int n  = sc.nextInt();
        boolean isPrime = true;

        for(int i = 2;i<n;i++)
        {
            if(n%i == 0)
            {                
                isPrime = false;
                break;
            }            
                
        }
        if(n<2)
            {
                isPrime = false;
            }
        System.out.println("IsPrime"+ isPrime);


    }
    
}
