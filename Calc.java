import java.util.*;

class Calc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = s.nextDouble();

        System.out.print("Enter b: ");
        double b = s.nextDouble();

        System.out.print("Enter operator (+ - * /): ");
        char op = s.next().charAt(0);

        if (op == '+') System.out.println(a + b);
        else if (op == '-') System.out.println(a - b);
        else if (op == '*') System.out.println(a * b);
        else if (op == '/') System.out.println(b != 0 ? a / b : "Error");
        else System.out.println("Invalid");

        s.close();
    }
}
