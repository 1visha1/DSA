public class InvertedAndRotatedHalfPyramid{
    public static void main(String... args){
        
        int n = 2;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(n>=j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            n--;
            System.out.println();
        }
    }
}