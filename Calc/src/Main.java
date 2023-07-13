import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число");
            int operand1 = scanner.nextInt();
            System.out.println("Выберите операцию");
            char operation = scanner.next().charAt(0);
            System.out.println("Введите число");
            int operand2 = scanner.nextInt();
            int result = 0;
            switch (operation) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    result = operand1 / operand2;

            }
            System.out.println("Результат: " + result);
        }
    }
}