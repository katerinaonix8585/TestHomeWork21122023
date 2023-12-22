public class Test {

    public static int sum(int n){
        if (n <=1) {
            return 1;
        }
        return n + sum(n -1);
    }

    public static int mupliply (int x, int y){
        if (y <= 1) {
            return x;
        }
        return x + mupliply (x, y - 1);
    }

    public static long factorial(long n){
        if (n <=1) {
            return 1;
        }
        return n * factorial(n -1);
    }

    public static void printNumberDirect (int n) {
        if (n <= 1) {
            System.out.println(n);
        } else {
            printNumberDirect((n-1));
            System.out.println(n);

        }
    }
    public static void printNumberReverse (int n) {
       if (n<=1) {
          System.out.println(n);
       } else {
          System.out.println(n);
          printNumberReverse(n-1);
    }
}
}