import java.util.Scanner;
public class ForloopPractice21 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        //loops are used to execute a set of statements repeatedly until a particular condition 
        //is satiefied
        //1--for loop
        //2--while loop
        //3--do while loop
        //Scanner sc = new Scanner(System.in);
        //for(int i = 0;i<100;i = i+1)
        // {
        //     System.out.println("Hello World "+ i);
        //     //System.out.println(i);
        // }

        // for Even number program
        // for(int i = 0;i<=100;i = i+2)
        // {
        //     System.out.println("This is even number"+ i);
        // }

        //Sum of 100 number
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0;i<=n;i++)
        {
             sum = sum+i;

         }
         System.out.println(sum);

        //Decrement of for loop
        // for(int i = 100;i>0;i=i-1)
        // {
        //     System.out.println(i);

        // }

        //Table of particluar number
        // System.out.println("Enter the particular number \n");
        // int n = sc.nextInt();
        // for(int i = 1;i<=10;i=i+1)
        // {
        //     System.out.println(n*i);
        // }

        //infinite loop

        // for(int i = 0;i<10;)
        // {
        //     System.out.println(i);
        // }





    }
    
}
