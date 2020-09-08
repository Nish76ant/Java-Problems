/*
While loop practice 3
Count the number of digits program in Java
formula = log10(n)+1
*/
import java.util.Scanner;
public class WhileloopPractice2 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valuee of the n\n");
        int n = sc.nextInt();
        int numOfDigits = (int)Math.log10(n)+1;
        System.out.println(numOfDigits);
    }
    
}
