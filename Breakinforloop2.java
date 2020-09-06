import java.util.Scanner;

public class BreakinForLoop {
    public static void main(String [] args)
    {
        // for(int i = 1;i<=100;i++)
        // {
        //     if(i==35)
        //     {
        //         break;
          
        //     }
        //     System.out.println(i);
        // }
        Scanner sc = new Scanner(System.in);        
        for(; ;)
        {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            if(n<0)
            {
                break;
            }
        }

    }

}
