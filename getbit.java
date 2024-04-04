import java.util.*;

public class getbit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitmask = 1 << pos;
        if ((bitmask & n) == 0) {
            System.out.println("bit is zero");
        } else {
            System.out.println("bit is not zero");
        }

    }
}
