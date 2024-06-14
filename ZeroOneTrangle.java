public class ZeroOneTrangle{
    public static void main(String... args){
        int count = 1;
        for(int i=1;i<6;i++){
            if(i%2==0){
                count=0;
            }else{
                count=1;
            }
            for(int j=0;j<i;j++){
                System.out.print(count);
                if(count==0){
                    count=1;
                }else{
                    count=0;
                }
            }
            System.out.println();
        }
    }
}