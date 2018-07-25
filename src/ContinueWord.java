public class ContinueWord {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i > 51 && i < 71) {
                continue; //skip the numbers between 51 & 71

            }
            System.out.println(i);
        }
    }
}
