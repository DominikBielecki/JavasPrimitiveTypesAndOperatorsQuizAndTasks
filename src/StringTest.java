public class StringTest {
    public static void main(String[] args) {
        String str1 = "HELLO";
        String str2 = "HELLO";
        System.out.println(str1 == str2);
        System.out.println(str1.equalsIgnoreCase(str2));

        String str3 = new String("HELLO");
        String str4 = new String("HELLO");
        System.out.println(str3 == str4);
        System.out.println(str3.equalsIgnoreCase(str4));

        String str5 = "HELLO";
        String str6 = "HELLO 1";
        System.out.println(str5 == str6);
        System.out.println(str5.equalsIgnoreCase(str6));
    }
}
