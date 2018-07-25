public class Zadacha1 {

    //Да се изведат съобщения към потребителя и да се прочетат 2 числа от клавиатурата A и B (може да са с плаваща запетая – double). После да се прочете 3-то число C и да се провери дали то е м/у A и B. Да се изведе подходящо съобщение за това дали C е между A и B.
    public static void main(String[] args) {
        double A = 13.2;
        System.out.println(A);

        double B = 29.5;
        System.out.println(B);

        double C = 22.1;
        System.out.println(C);
        if (C > A && C < B) {

            System.out.println("The number 22.1 is between 13.2 and 29.5");
        } else {
            System.out.println("The number 22.1 is not between 13.2 and 29.5");
        }
    }
}
