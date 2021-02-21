public class Main {
    public static void main(String[] args) throws Exception {

        // получаем массив с тремя строками
        String[] in = Input.inputUser();

        // проверка входных данных
        MistakeParser.mistakeParser(in);

        // Проверяем на римские
        int num1 = ToArabic.toArabic(in[0]);
        int num2 = ToArabic.toArabic(in[2]);

        // производим рассчёт
        int result = Calculator.calculate(num1, num2, in[1]);

        // вывод результата на экран
        ShowResult.showResult(in[0], in[2], result);
    }
}