public class ArabicToRoman {
    public static String toRoman(int input) {
        int inputNumber = input;
        if (inputNumber < 1 || inputNumber > 100) return "Invalid Roman number value";

        StringBuilder s = new StringBuilder();

        while (inputNumber == 100) {
            s.append("C");
            inputNumber -= 100;
        }
        while (inputNumber >= 90) {
            s.append("XC");
            inputNumber -= 90;
        }
        while (inputNumber >= 50) {
            s.append("L");
            inputNumber -= 50;
        }
        while (inputNumber >= 40) {
            s.append("XL");
            inputNumber -= 40;
        }
        while (inputNumber >= 10) {
            s.append("X");
            inputNumber -= 10;
        }
        while (inputNumber >= 9) {
            s.append("IX");
            inputNumber -= 9;
        }
        while (inputNumber >= 5) {
            s.append("V");
            inputNumber -= 5;
        }
        while (inputNumber >= 4) {
            s.append("IV");
            inputNumber -= 4;
        }
        while (inputNumber >= 1) {
            s.append("I");
            inputNumber -= 1;
        }
        return s.toString();
    }
}
