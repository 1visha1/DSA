public class HollowRhumbus{
    public static int patern(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i)-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String... args){
        patern(5);
    }
}