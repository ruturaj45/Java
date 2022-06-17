import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int a, b;
        double c;
        char op;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value of A : ");
        a = sc.nextInt();
        System.out.print("Enter the Operator ( + , - , * , / , % ) : ");
        op = sc.next().charAt(0);
        System.out.print("Enter The Value of B : ");
        b = sc.nextInt();

        switch (op) {
            case '+':
                c = a + b;
                System.out.println(a + " + " + b + " = " + c);
                break;
            case '-':
                c = a - b;
                System.out.println(a + " - " + b + " = " + c);
                break;
            case '*':
                c = a * b;
                System.out.println(a + " * " + b + " = " + c);
                break;
            case '/':

                if (b == 0) {
                    System.out.println("Cannot devide by zero.");
                } else
 
                {
                    c = a / b;
                    System.out.println(a + " / " + b + " = " + c);
                }
                break;
            case '%':
                c = a % b;
                System.out.println(a + " % " + b + " = " + c);
                break;
            default:
                System.out.println("Invalid!!! Wrong operator !!!");
        }
    }
}