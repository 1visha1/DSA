public class SolidRhombus{
    public static int pattern(int n){


        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i)-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String... args){
          pattern(5);
    }
}