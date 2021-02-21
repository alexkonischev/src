import java.util.ArrayList;

public class IfOutputRoman {
    public static boolean ifOutputRoman(String value1, String value2) {
        ArrayList<String> massive = new ArrayList <>();
        massive.add("I");
        massive.add("II");
        massive.add("III");
        massive.add("IV");
        massive.add("V");
        massive.add("VI");
        massive.add("VII");
        massive.add("VIII");
        massive.add("IX");
        massive.add("X");
        return massive.contains(value1) && massive.contains(value2);
    }
}
