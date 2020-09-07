//Pattern Practice 6 in Java
/*
          1
        2  3
      4  5  6
    7  8  9  10
  11  12  13  14  15
16  17  18  19  20  21
*/
import java.util.Scanner;
public class PatternPractice6 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the n");
        int n = sc.nextInt();
        int number = 1;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int k = 1;k<=i;k++)
            {
                System.out.print(number++ +"  ");
            }
            System.out.println();
        }

    }
    
}
