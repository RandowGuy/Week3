package task1;
import static java.lang.Math.abs;

public class Methods {
    public static int gcd(int a , int b){
       int gcd = 1;
       for( int i = 1 ; i <= abs(a); i ++){
           if(a%i == 0 && b%i == 0) gcd = i;
       }
       return gcd;
    }
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
    public static void sieveEratosthenes(int n) {
        boolean A[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            A[i] = true;
        for(int p = 2; p*p <= n; p ++){
            if(A[p] == true ){
                for(int i = p*2 ; i < n ; i+=p){
                    A[i] = false;
                }
            }
        }
        for(int i = 2 ;i <= n ; i++){
            if(A[i] == true) {
                System.out.print(i + " ");
            }
        }
    }


}
