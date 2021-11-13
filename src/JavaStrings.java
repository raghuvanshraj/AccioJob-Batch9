import java.util.Arrays;

public class JavaStrings {
    public static void main(String[] args) {
        String text = "Hello my name is Raghu. What is your name?";

        // indexOf
        System.out.println(text.indexOf('m'));
        System.out.println(text.indexOf('m', 7));
        System.out.println(text.indexOf("name"));
        System.out.println(text.indexOf("name", 13));

        // charAt
        System.out.println(text.charAt(6));

        // replace
        System.out.println(text.replace('m', '#'));
        System.out.println(text.replace("name", "####"));

        // substring
        System.out.println(text.substring(7));
        System.out.println(text.substring(7, 15));

        // split
        System.out.println(Arrays.toString(text.split(" ")));
        System.out.println(Arrays.toString(text.split(" ", 4)));
    }
}
