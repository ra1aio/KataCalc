import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String[] userInput = sc.nextLine().split(" ");
        String[] userInput = new String[]{"2", "+", "3"};
        System.out.println(Arrays.toString(userInput));

        int num1 = Integer.parseInt(userInput[0]);
        String operations = userInput[1];
        int num2 = Integer.parseInt(userInput[2]);

        System.out.println(num1);
        System.out.println(operations);
        System.out.println(num2);

    }




}
