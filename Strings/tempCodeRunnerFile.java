public class CompressionOfString{
    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            sb.append(charAt(i));
            Integer count= 0;
            while(str.charAt(i)==a){
                count++;
                i++;
            }
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String... args){
        System.out.println(compress("aaaabaabb"));
    }
}