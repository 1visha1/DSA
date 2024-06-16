public class PrimeNumber {
    public static boolean prime(int n){
        boolean p = true;

        for(int i=2;i<n;i++){
            if(n%i==0){
                p = false;
            }
        }
        return p;
    }

    public static void main(String... args){
        System.out.print(prime(8));
    }
}