public class Hw2Zadacha3 {
    //Задача 3: Да се изведат на екрана всички нечетни числа от -10 до 10

    public static void main(String[] args) {
        for (int x = -10; x < 10; x++ ) {
            if (x % 2 !=0) {
                System.out.println(x);
            }
        }
    }
}
