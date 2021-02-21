public class ToArabic {
    public static int toArabic(String value) {

        try {
            switch (value) {
                case "I": return 1;
                case "II": return 2;
                case "III": return 3;
                case "IV": return 4;
                case "V": return 5;
                case "VI": return 6;
                case "VII": return 7;
                case "VIII": return 8;
                case "IX": return 9;
                case "X": return 10;
            }

            int i = Integer.parseInt(value);
            if (i <= 10 && i >= 1) {
                return Integer.parseInt(value);
            }

            throw new Exception();

        } catch (Exception e) {
            System.out.println("Invalid value");
            System.exit(0);
        }

        return 0;
    }
}
