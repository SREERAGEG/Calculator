package JAVA;
import java.util.Stack;

public class ExpressionEvaluator {
    
    public double evaluateExpression(String expression) {
        Stack<Double> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == ' ')
                continue;

            if (Character.isDigit(ch) || ch == '.') {
                StringBuilder operand = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    operand.append(expression.charAt(i));
                    i++;
                }
                operands.push(Double.parseDouble(operand.toString()));
                i--;
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (operators.peek() != '(')
                    operands.push(applyOperator(operators.pop(), operands.pop(), operands.pop()));
                operators.pop();
            } else if (isOperator(ch)) {
                while (!operators.empty() && precedence(ch) <= precedence(operators.peek()))
                    operands.push(applyOperator(operators.pop(), operands.pop(), operands.pop()));
                operators.push(ch);
            }
        }

        while (!operators.empty())
            operands.push(applyOperator(operators.pop(), operands.pop(), operands.pop()));

        return operands.pop();
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    private static double applyOperator(char operator, double b, double a) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new ArithmeticException("Division by zero");
                return a / b;
        }
        return 0;
    }

    
}