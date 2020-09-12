//Bubble sort in java by user input
import java.util.Scanner;
public class Practice12 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to enter in array ?:");
        int num = sc.nextInt();
        int array[] = new int[num];
        System.out.println("Enter the" +num+ "number");
        //Here we are entering how many elements do you want to sort 
        for(int i = 0;i<num;i++)
        {
            array[i] = sc.nextInt();
        }
        //here values will compare to each other 
        for(int i = 0;i<num-1;i++)
        {
            for(int j = 0;j<num-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Elements are :");
        for(int item : array)
        {
            System.out.print(item);
        }
    }
    
}
