package week4;
import java.util.Scanner;
import static week4.ex9.Alphabet;
public class ex10{
    public static void main(String[] args) {
    String s1;
    String s2;
    Scanner sc = new Scanner(System.in);
    s1=sc.nextLine();
    s2=sc.nextLine();

       System.out.println(anagram(s1,s2));

    }
    public static boolean anagram(String s1,String s2){
        s1=Alphabet(s1);
        s2=Alphabet(s2);
        return s1.equals(s2)?true:false;

        }

}
