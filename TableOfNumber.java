//Table of specific number to particular number
import java.util.Scanner;
public class TableOfSpecificNumberPractice 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Specific Number \n");
        int n = sc.nextInt();
        for(int j = 1;j<=n;j++)
        {
            for(int i = 1;i<=10;i++)
            {
                System.out.print(n * i+" ");
            }
            System.out.println();
        }

    }
    
}
