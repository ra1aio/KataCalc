import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        System.out.println(calc(input));
    }
    public static String calc(String input) throws WrongDataException{
        String[] inputArr = input.trim().split(" ");
        dataVerification(inputArr);
        int num1 = Integer.parseInt(inputArr[0]);
        int num2 = Integer.parseInt(inputArr[2]);
        String operator = inputArr[1];
        int res;
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
                break;
            default:
                throw new WrongDataException("Недопустимый оператор");
        }
        return String.valueOf(res);
    }

    private static void dataVerification(String[] userInput) throws WrongDataException {

        //В строке лишние символы
        if (userInput.length != 3) {
            throw new WrongDataException("Строка не является математической операцией");
        }
        try {
            int num1 = Integer.parseInt(userInput[0]);
            int num2 = Integer.parseInt(userInput[2]);

            //Одно из чисел меньше 0 или больше 10
            if ((num1 > 10 || num2 > 10) || (num1 < 1 || num2 < 1)) {
                throw  new WrongDataException("Числа не могут быть меньше 0 или больше 10");
            }
            // Ошибка при парсинге в число
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Неверный ввод одного из чисел");
        }
    }

}
