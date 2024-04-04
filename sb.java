import java.util.*;

public class sb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("pirat");
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'v');
        System.out.println(sb);
    }
}