import java.util.Scanner;

public class Hw2Zadacha6 {
    //Задача 6: Да се прочете число от екрана(конзолата) и да се изведе сбора на всички числа между 1 и въведеното число.
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i <= 7; i++) {
            sum = sum+i;
        }
        System.out.println("Entered number is 7");
        System.out.println("the sum of all numbers between is:"  +  sum);
    }
}



