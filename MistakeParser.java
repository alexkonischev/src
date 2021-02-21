import java.util.ArrayList;

public class MistakeParser {
    public static void mistakeParser(String[] in) {
        String value1 = in[0];
        String value2 = in[2];
        String symbol = in[1];

        ArrayList<String> massiveNumbers = new ArrayList<>();
        massiveNumbers.add("1");
        massiveNumbers.add("2");
        massiveNumbers.add("3");
        massiveNumbers.add("4");
        massiveNumbers.add("5");
        massiveNumbers.add("6");
        massiveNumbers.add("7");
        massiveNumbers.add("8");
        massiveNumbers.add("9");
        massiveNumbers.add("10");
        ArrayList<String> massiveRoman = new ArrayList <>();
        massiveRoman.add("I");
        massiveRoman.add("II");
        massiveRoman.add("III");
        massiveRoman.add("IV");
        massiveRoman.add("V");
        massiveRoman.add("VI");
        massiveRoman.add("VII");
        massiveRoman.add("VIII");
        massiveRoman.add("IX");
        massiveRoman.add("X");
        ArrayList<String> massiveOperation = new ArrayList <>();
        massiveOperation.add("+");
        massiveOperation.add("-");
        massiveOperation.add("*");
        massiveOperation.add("/");
        if ((massiveNumbers.contains(value1) && !massiveNumbers.contains(value2) ||
                !massiveNumbers.contains(value1) && massiveNumbers.contains(value2))
                ||
                ((massiveRoman.contains(value1) && !massiveRoman.contains(value2)) ||
                        (!massiveRoman.contains(value1) && massiveRoman.contains(value2)))
                ||
                !massiveOperation.contains(symbol)
        ) {
            System.out.println("Error! Different type/out of the range/unavailable operation...");
            System.exit(0);
        }
    }
}
