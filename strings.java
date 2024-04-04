import java.util.*;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstname = sc.nextLine();
        String lastname = sc.nextLine();
        String fullname = firstname + " " + lastname;
        System.out.println(fullname.length());
        for(int i = 0; i<fullname.length(); i++ ){
            System.out.println(fullname.charAt(i));
        }

    }
}