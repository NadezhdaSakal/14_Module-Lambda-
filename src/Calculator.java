public class Calculator {

    @FunctionalInterface
    interface Operationable {
        int calculate(int operand1, int operand2);
    }

    public int operate(int x, int y, Operationable mathOperation) {
        return mathOperation.calculate(x, y);
    }

    void addition(int a, int b) {
        Operationable additionOp = (int operand1, int operand2) -> operand1 + operand2;
        System.out.println(""+ a + " + " + b + " = " + additionOp.calculate(a, b) );
    }

    void subtraction(int a, int b) {
        Operationable subtractionOp = (int operand1, int operand2) -> operand1 - operand2;
        System.out.println(""+ a + " - " + b + " = " + subtractionOp.calculate(a, b) );
    }

     void multiplication(int a, int b) {
        Operationable multiplicationOp = (operand1, operand2) -> operand1 * operand2;
         System.out.println(""+ a + " * " + b + " = " + multiplicationOp.calculate(a, b) );
    }

     void division(int a, int b)  {
        try {
            Operationable divisionOp = (operand1, operand2) -> operand1 / operand2;
            System.out.println(""+ a + " / " + b + " = " + divisionOp.calculate(a, b) );
        } catch (ArithmeticException e) {
            System.out.println("Недопустимое арифметическое действие: нельзя делить на 0");
        } finally {
        }

     }


}











        // switch (operation) {
        //   case '+':
        //   System.out.println(operand1 + operand2);
        //  break;
        //    case '-':
        //       System.out.println(operand1 - operand2);
        //       break;
        //  case '*':
        //       System.out.println(operand1 * operand2);
        //      break;
        //   case '/':
        //     if (operand2 == 0) {
        //       System.out.println("Divide by zero");
        //     break;
        //    }
        //    System.out.println(operand1 / operand2);
        //  break;
        //  default:
        //       System.out.println("Unknown operation: " + operation);






