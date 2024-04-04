import java.util.*;

public class question


    public static int calculatedAvg(int a, int b, int c) {
        int Avg = a + b + c % 2;
        System.out.println(Avg);
        return Avg;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        calculatedAvg(a, b, c);

    }
}
