import java.util.Scanner; 
public class SwitchCasePractice23 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number \n");
        int rating = sc.nextInt();
        switch(rating)
        {
            //Uber Ola Reviews System..
            case 1:
            case 2:
            System.out.println("Bad Review");
            break;
            case 3:
            System.out.println("Average Review");
            break;
            case 4:
            case 5:
            System.out.println("Good Review");
            break;
        }

    }

}
