package LearningProgarms;

import java.util.Scanner;;

public class Main {
    int num1, num2;
    char operator;
    Scanner input = new Scanner(System.in);

    int add(int x, int y) {
        return x + y;
    }

    int sub(int x, int y) {
        return x - y;
    }

    int mul(int x, int y) {
        return x * y;
    }

    double div(double x, double y) {
        return x / y;
    }

    public void Operator() {
        input();

        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + sub(num1, num2));
                break;
            case '*':
                System.out.println(num1 + " x " + num2 + " = " + mul(num1, num2));
                break;
            case '/':
                if (num1 <= 0 || num2 <= 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + div((double) num1, (double) num2));
                }
                break;
            default:
                System.out.println("Invaild Operator");
        }
    }

    public void input() {
        try {
            System.out.print("Inupt num1 => ");
            num1 = input.nextInt();

            System.out.print("Inupt num1 => ");
            num2 = input.nextInt();

            System.out.print("Choose Operator[+, -, *, /] => ");
            operator = input.next().charAt(0);

             input.close();
        } catch (Exception e) {
            System.out.println("Invaild Number or Invaild Operator");
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.Operator();
    }

}