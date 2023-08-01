import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class eAddress {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(isValidEmail(a));

    }
    public static boolean isValidEmail(String test){
        String regex="^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(test);
        return matcher.matches();
    }
}
