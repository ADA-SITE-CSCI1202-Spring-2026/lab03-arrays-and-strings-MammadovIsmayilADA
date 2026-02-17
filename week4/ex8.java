package week4;

public class ex8 {

    public static void main(String[] args) {
        String s1="Hello";
       System.out.println(exploded(s1));
        
    };
       public static String exploded(String s)
       {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
            char c=s.charAt(j);
            sb.append(c);
            }
       }
       return sb.toString();
    }
}