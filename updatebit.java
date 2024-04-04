import java.util.*;

public class updatebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 3;
        int bitmask = 1 << pos;
        if (oper == 1) {
            int newnumber = bitmask | n;
            System.out.println(newnumber);
        } else {
            int newbitmask = ~(bitmask);
            int newnumber = newbitmask & n;
            System.out.println(newnumber);

        }

    }
}
