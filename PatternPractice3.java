/*
Pattern 3 in Java

* * * *
* * * 
* * 
*

*/
import java.util.Scanner;
public class PatternPractice3 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the n \n");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            for(int j = i;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n-i+1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
