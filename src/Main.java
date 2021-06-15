import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int operand1 = scanner.nextInt();


        System.out.println("Введите второе число:");
        int operand2 = scanner.nextInt();

        Calculator calculator = new Calculator();
        calculator.addition(operand1, operand2);
        calculator.subtraction(operand1, operand2);
        calculator.multiplication(operand1, operand2);
        calculator.division(operand1, operand2);
    }
}
