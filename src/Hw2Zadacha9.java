public class Hw2Zadacha9 {
    public static void main(String[] args) {
        //Задача 9: Въведете число от клавиатурата и определете дали е просто. Просто число е това което се дели САМО на 1 и на себе си.
        int i,m = 0, flag =0;
        int n = 5; //the number to be checked
        m = n/2;
        if (n==0 || n ==1) {
            System.out.println(n + ":is not prime number");
        } else  {
            for (i =2; i <= m; i++) {
                if (n%i==0) {
                    System.out.println(n+ ":is not prime number");
                }
            }
            if (flag==0) {System.out.println(n + ":is primer number");}
        } //end of else

    }
}
