public class BinomialCoefficient{

    public static int fact(int n){
        if(n==1||n==0){
            return 1;
        }else{
            n=n*fact(n-1);
            return n;
        }
    }

    public static void main(String... args){
        int c = fact(10)/*/(fact(2)*fact(10-2))*/;
        System.out.print(c);
    }
}