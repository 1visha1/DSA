public class SubString{
    public static String subString(String str, int si, int ei){
        String subStr ="";
        for(int i=si;i<=ei;i++){
            subStr+= str.charAt(i);
        }
        return subStr;

    }

    public static void main(String... args){
        // User Defin method
        String str = "HelloWorld";
        System.out.println(subString(str, 2,5));

        // Using predefine method
        System.out.println(str.substring(2,5));
    }
}