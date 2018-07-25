public class Zadacha3hw1 {

    //Въведете 2 различни числа от конзолата и разменте стойността им. Разпечатайте новите стойности
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before swap:");
        System.out.println("x value: "+x);

        int y = 15;
        System.out.println("y value: "+y);

        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);

    }
}
