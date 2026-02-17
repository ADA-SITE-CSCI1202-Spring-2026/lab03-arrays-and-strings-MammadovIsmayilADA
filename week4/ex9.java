package week4;
import java.util.Arrays;
public class ex9 {
    public static void main(String[] args) {
        String s1="HelloWorld";
       System.out.println(Alphabet(s1));

    }

    public static String Alphabet(String s)
    {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);

    }}