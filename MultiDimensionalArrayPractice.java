//Multiplication of two matrix in java by user input
import java.util.Scanner;
public class MultiDimensionalArrayPractice 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols = sc.nextInt();
        //ist array
        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        System.out.println("Enter the values of array A");
        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j<cols;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value of the array B");
        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j<cols;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        int c[][] = new int[rows][cols];
        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j<cols;j++)
            {
                c[i][j] = a[i][j]*b[i][j];
            }
        }
        System.out.println("Result array C is :");
        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j<cols;j++)
            {
                System.out.print(c[i][j] + " ");
            }
        }
        System.out.println();
        sc.close();

    }
    
}
