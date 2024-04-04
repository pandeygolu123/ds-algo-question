import java.util.*;

public class clearbit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 3;
        int bitmask = 1 << pos;
        int notbitmask = ~bitmask;
        int newnumber = notbitmask & n;
        System.out.println(newnumber);

    }

}
