import java.util.Scanner;

public class SwitchCasePractice {
    public static void main(String[] args) {
        // Switch case
        // Java for Dummies good for Begineers of Java
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your Days number");
        // int noOfDays = sc.nextInt();

        // switch(noOfDays)
        // {
        // case 1:
        // System.out.println("I am in leave");
        // break;

        // case 2:
        // System.out.println("I am going to Jaipur");
        // break;

        // case 3:
        // System.out.println("I am going to Mumbai");
        // break;

        // case 4:
        // System.out.println("I am going to Pune");
        // break;

        // case 5:
        // System.out.println("I am going to Banglore");
        // break;

        // case 6:
        // System.out.println("I am going to Ahmedabad");
        // break;

        // case 7:
        // System.out.println("I am going to Banglore");
        // break;

        // default:
        // System.out.println("You entred invalid number");
        // }

        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Enter Your Operation");
        sc.nextLine();
        char operation = sc.nextLine().charAt(0);
        int result = 0;

        switch (operation) {
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                result = a / b;
                break;

            default:
                System.out.println("Enter valid operation");

        }
      System.out.println("Your result is"+" "+result);  
    }
}
