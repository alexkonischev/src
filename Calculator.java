
public class Calculator {

    public static int calculate(int number1, int number2, String symbol) {
        int result = 0;
        switch (symbol) {
                case "+": result = number1 + number2;
                break;
                case "-": result = number1 - number2;
                    break;
                case "*": result = number1 * number2;
                    break;
                    case "/": result = number1 / number2;
                    break;
            }

            return result;
    }
}
