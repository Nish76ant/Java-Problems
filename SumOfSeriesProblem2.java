/*
Compute the natural logarithim of 2, by adding up to n terms in the series
1-1/2+1/3-1/4+1/5-....1/n
Where n is a positive integer and input by user
*/
import java.util.Scanner;
public class SumofSeriesProblem2 
{
    public static void main(String [] args)    
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the value pf n\n");
        int n = sc.nextInt();
        float result = 0;
        for(float i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                result -= 1/i;
            }
            else{
                result += 1/i;
            }
        }
        System.out.println(result);
    }
    
}
