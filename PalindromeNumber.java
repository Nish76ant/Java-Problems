/*
Palindrome number
write a program to check if given number is a palindrome or not
an integer is a palindrome if the reverse of that number isequal to the original number
Eg - 12321 - 12321 is palindrome
*/
import java.util.Scanner;
public class PalindromeNumber 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the n \n");
        int n = sc.nextInt();
        int temp = n;
        int reverseNumber = 0;
        while(temp>0)
        {
            int lastDigit = temp%10;
            temp = temp/10;
            reverseNumber = reverseNumber*10+lastDigit;


        }
        if(reverseNumber == n)
        {
            System.out.println(n+" is a palindrome");            
        }
        else
        {
            System.out.println("This is not palindrome");
        }
        
    }
    
}
