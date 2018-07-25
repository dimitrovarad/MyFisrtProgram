import java.io.PrintStream;

//Въведете 2 различни целочислени числа от конзолата. Запишете тяхната сума, разлика, произведение, остатък от деление и целочислено деление в отделни променливи и разпечатайте тези резултати в конзолата. Опитайте същото с числа с плаваща запетая.

public class Zadacha2hw1 {
    public static void main(String[] args) {
        int x = 7;
        System.out.println(x);

        int y = 5;
        System.out.println(y);

        int Sum = x+y;
        System.out.printf("Sum is =%d%n", Sum);

        int Subtraction = x-y;
        System.out.printf("Subtraction is =%d%n", Subtraction);

        int Multiplication = x*y;
        System.out.printf("Multiplication is = %d%n", Multiplication);

        int Division;
        Division = x/y;
        System.out.printf("Division is = %d%n", Division);

        int Remainder = x%y;
        System.out.printf("Remainder is =%d%n", Remainder);
    }
    }

