import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String[] inputArr = input.trim().split(" ");
        dataVerification(inputArr);
        System.out.println(calculation(inputArr));



    }

    private static void dataVerification(String[] userInput) throws WrongDataException {

        //В строке лишние символы
        if (userInput.length != 3) {
            throw new WrongDataException("Строка не является математической операцией");
        }
        try {
            int num1 = Integer.parseInt(userInput[0]);
            int num2 = Integer.parseInt(userInput[2]);
            String operator = userInput[1];
            //Одно из числе больше 10
            if (num1 > 10 || num2 > 10) {
                throw  new WrongDataException("Числа не могут быть больше 10");
            }
            //Неверный знак операции
            if (!operator.equals("+") & !operator.equals("-") & !operator.equals("/") & !operator.equals("*")) {
                throw new WrongDataException("Недопустимый оператор");
            }
            // Деление на ноль
            if (num2 == 0 & operator.equals("/")) {
                throw new ArithmeticException("Деление на ноль");
            }
            // Ошибка при парсинге в число
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Неверный ввод одного из чисел");
        }
    }
    private static int calculation(String[] userInput) {
        int num1 = Integer.parseInt(userInput[0]);
        int num2 = Integer.parseInt(userInput[2]);
        String operator = userInput[1];
        int res = 0;
        switch (operator) {
            case "+" :
                res = num1 + num2;
                break;
            case "-" :
                res = num1 - num2;
                break;
            case "*" :
                res = num1 * num2;
                break;
            case "/" :
                res = num1 / num2;
        }
        return res;
    }
}
