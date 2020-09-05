/*Series Sum
Write a program to calculate the sum of following series where n
is input by user
1+1/2+1/3+1/4+1/5+........1/n
*/
import java.util.Scanner;
public class SeriesSumPractice 
{
    public static void main(String [] args)    
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n \n");
        int n = sc.nextInt();
        float result = 0;
        for(float i = 1;i<=n;i++)
        {
            result += 1/i;
        }
        System.out.println(result);
    }
    
}
