package dsandalgo.recursion;

public class Factorial {

    public static void main(String[] args) {
        int num = 5;
        if(num == 0) System.out.println(1); else {
            int factorial = factorial(num);
            System.out.println(factorial);
        }
        iterativeFactorial(num);
    }

    public static int factorial(int n) {
        if(n == 0) return 1; else return n*factorial(n-1);
    }

    public static void iterativeFactorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
