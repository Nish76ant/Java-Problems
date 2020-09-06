public class Continue1 
{
    public static void main(String [] args)
    {
        //Continue
        //Continue skips the iteration
        for(int i = 1;i<=10;i++)
        {
            if(i >= 4 && i<6)
            {
                continue;
            }
            System.out.println(i);
        }
    }
    
}
