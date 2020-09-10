//Array Practice 1 Que in Java
//Average of the marks in java

import java.util.Scanner;
public class Arraypractice1 
{
    public static void main(String [] args)
    {
        //int n;
        int sum = 0;
        float average;
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Students in Your Class ? ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter the number of the students \n");
        for(int i = 0;i<n;i++)
        {
            marks[i] = sc.nextInt();
            sum = sum+marks[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum/n;
        System.out.println("Average:"+average);
    }
    
}
