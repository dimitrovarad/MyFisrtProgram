public class DescendingOrderDigits {

    //Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ ред.
    public static void main(String[] args) {
        int x = 21;
        int y = 45;
        int z = 18;

        System.out.println("Ascending order:");
        if (z < x && z < y) {
            System.out.println(z);
            System.out.println(x);
            System.out.println(y);

        }
        System.out.println("Descending order:");
        if (y > x && y > z) {
            System.out.println(y);
            System.out.println(x);
            System.out.println(z);
        }

        }

    }


