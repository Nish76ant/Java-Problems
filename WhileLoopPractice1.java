/*
Sum of the digits of a number
Write a program to find the sum of the digits of a number
eg - . for given number 523 the sum is 10
21-------->3
235 ------> 10
433256------->23
*/
import java.util.Scanner;
public class WhileloopPractice1 
{
    public static void main(String [] args)
    {
        //While Loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the n\n");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp>0)
        {
            int lastDigit = temp%10;
            temp /= 10;
            sum += lastDigit;
        }
        System.out.println(" the sum of the digits of" +n+ " is"+ sum);

    }
    
}
