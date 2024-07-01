public class CompressionOfString {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); ) {
            char a = str.charAt(i);
            sb.append(a);
            int count = 0;
            while (i < str.length() && str.charAt(i) == a) {
                count++;
                i++;
            }
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String... args) {
        System.out.println(compress("aaaabaabb")); // Expected output: a4ba2b2
    }
}
