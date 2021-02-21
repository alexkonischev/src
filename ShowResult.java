public class ShowResult {
    public static void showResult(String a, String b, int c) {
        if (IfOutputRoman.ifOutputRoman(a, b)) {
            String resultInRoman = ArabicToRoman.toRoman(c);
            System.out.println(resultInRoman);
        } else {
            System.out.println(c);
        }
    }
}
