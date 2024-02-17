import java.util.Scanner;
public class Main
{
    public static void main(String[] args)

    {
        /* Question number 1: Write an application that displays a box, an oval, an arrow and a diamond using asterisk (*)
        as follows*/
        System.out.println("************");
        System.out.println("*          *");
        System.out.println("*          *");
        System.out.println("*          *");
        System.out.println("*          *");
        System.out.println("*          *");
        System.out.println("*          *");
        System.out.println("*          *");
        System.out.println("************");
        System.out.println("------------------------------");
        System.out.println("     ***     ");
        System.out.println("  *       *");
        System.out.println(" *         *");
        System.out.println("*           *");
        System.out.println("*           *");
        System.out.println("*           *");
        System.out.println(" *         *");
        System.out.println("  *       *");
        System.out.println("     ***     ");
        System.out.println("------------------------------");
        System.out.println("  *");
        System.out.println(" *** ");
        System.out.println("*****");
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("------------------------------");
        System.out.println("    *");
        System.out.println("   * *");
        System.out.println("  *   *");
        System.out.println(" *     *");
        System.out.println("*       *");
        System.out.println(" *     *");
        System.out.println("  *   *");
        System.out.println("   * *");
        System.out.println("    *");
        System.out.println("------------------------------");
// Question no 2:
        // Write Java statements that accomplish each of the following tasks:
        //   a. Display the message “Enter an Integer:”
            System.out.println("Enter an Integer");
        //    b. Assign the product of variables b and c to variable a.
            int b = 20;
            int c = 30;
            int a;
            a = b*c;
        //    c. Use a comment to state that a program performs a sample payroll calculation.
        // This program performs a sample payroll calculation.
        System.out.println("------------------------------");
// Question no: 3
        /*Write an application that asks the user to enter two integers, obtains them from the user
            and prints their sum, product, difference, quotient (division).*/
        // using Scanner class to enter the numbers
        Scanner userInput= new Scanner(System.in);
        System.out.println(" Enter two integers: ");
        int num1= userInput.nextInt();
        int num2= userInput.nextInt();
        int sum;
        int dif;
        int product;
        double div;
        sum= num1 + num2;
        dif= num1-num2;
        product=num1*num2;
        div = (double)num1/num2;
        // Printing the required output
        System.out.println(" Sum of two numbers is : "+ sum);
        System.out.println(" product of two numbers is : "+ product);
        System.out.println(" Difference of two numbers is : "+ dif);
        System.out.println(" Quotient of two numbers is : "+ div);
    }
}