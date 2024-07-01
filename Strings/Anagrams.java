public class Anagrams{

    public static boolean anagrams(String str1, String str2){
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str1.length();j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        break;
                    }else if(str1.length()==j){
                        return false;
                    }
                }
            }
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String... args){
        System.out.println(anagrams("race","care"));
    }
}